import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {

        //
        // 0, " "
        // 1, ─
        // 2, │
        // 3, ┎
        // 4, ┒
        // 5, ┕
        // 6, ┛
        // 7, ┤
        // 8, ┴
        // 9, ├
        // 10, ┬
        // 11, ┼
        //
        int[][] board = {
                { 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4 },
                { 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 0, 1, 1, 8, 1, 1, 8, 4, 0, 3, 1, 1, 0, 0, 0, 0, 2 },
                { 2, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 2, 0, 0, 0, 0, 1, 1, 7, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 9, 1, 7, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 2, 0, 0, 0, 0, 0, 1, 11, 1, 10, 1, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 9, 1, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 2, 0, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 5, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6 }, };

        GameBoard gameBoard = new GameBoard(board);

        List<Creature> creatures = new ArrayList<Creature>();
        creatures.add(new Creature("Player 1", 'x', new Location(7, 4)));
        creatures.add(new Creature("Player 2", 'o', new Location(3, 2)));

        List<Item> things = new ArrayList<Item>();
        things.add(new Item("Sword", 10, 1, new Location(4, 5)));
        things.add(new Item("Hammer", 5, 3, new Location(15, 2)));
        things.add(new Item("Rock", 1, 5, new Location(13, 7)));


        // Scanner scanner = new Scanner(System.in);
        // int scanner = new ProcessBuilder("powershell", "-Command",
        // "$Host.UI.RawUI.ReadKey(\"NoEcho, IncludeKeyUp\")").inheritIO()
        // .start();
        // System.err.println(scanner);
        boolean exit = false;

        ProcessBuilder scanner = new ProcessBuilder("powershell", "-Command",
                "$Host.UI.RawUI.ReadKey()  | Select -ExpandProperty Character")
                        .inheritIO();

        scanner.redirectOutput(Redirect.PIPE);
        scanner.redirectInput(Redirect.INHERIT);

        while (exit == false) {
            gameBoard.render(creatures, things);
            debug(gameBoard, creatures);

            Process process = scanner.start();

            process.waitFor();

            String stout =
                    process.inputReader(Charset.defaultCharset()).readLine();

            System.err.println(stout);


            // clear terminal
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start()
                    .waitFor();


            char c = ' ';
            try {
                // c = scanner.nextLine().charAt(0);
                c = stout.charAt(0);
            } catch (Exception e) {
            }

            if (c == 'q') {
                exit = true;
            } else if (c == 'w') {
                Movehandler.move(Direction.UP, creatures.get(0), gameBoard);
            } else if (c == 's') {
                Movehandler.move(Direction.DOWN, creatures.get(0), gameBoard);
            } else if (c == 'a') {
                Movehandler.move(Direction.LEFT, creatures.get(0), gameBoard);
            } else if (c == 'd') {
                Movehandler.move(Direction.RIGHT, creatures.get(0), gameBoard);
            } else {
                Movehandler.move(creatures.get(0), gameBoard);
                System.err.println("NEW MOVE");
            }

        }

        // scanner.close();
    }

    private static void debug(GameBoard gameBoard, List<Creature> creatures) {
        System.err.println("RIGHT:" + gameBoard.getBoard()[creatures.get(0)
                .getLocation().y][creatures.get(0).getLocation().x + 1]);
        System.err.println("LEFT:" + gameBoard.getBoard()[creatures.get(0)
                .getLocation().y][creatures.get(0).getLocation().x - 1]);
        System.err.println(
                "DOWN:" + gameBoard.getBoard()[creatures.get(0).getLocation().y
                        + 1][creatures.get(0).getLocation().x]);
        System.err.println(
                "UP:" + gameBoard.getBoard()[creatures.get(0).getLocation().y
                        - 1][creatures.get(0).getLocation().x]);
        System.err.println("LOCATION:" + creatures.get(0).getLocation().x + ","
                + creatures.get(0).getLocation().y);

    }
}

