import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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
                { 9, 1, 7, 0, 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 2, 0, 0, 0, 0, 0, 1, 11, 1, 10, 1, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 9, 1, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 2, 0, 0, 2, 0, 0, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 2 },
                { 2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2 },
                { 5, 1, 1, 1, 1, 8, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 6 }, };

        GameBoard gameBoard = new GameBoard(board);

        Creature[] creatures = new Creature[2];
        creatures[0] = new Creature("Player 1", 'x', new Location(2, 3));
        creatures[1] = new Creature("Player 2", 'o', new Location(3, 2));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (exit == false) {
            System.err.println(gameBoard.stringify(creatures));
            debug(gameBoard, creatures);

            char c = scanner.next().charAt(0);

            if (c == 'q') {
                exit = true;
            } else if (c == 'w') {
                Movehandler.move(Direction.UP, creatures[0], gameBoard);
            } else if (c == 's') {
                Movehandler.move(Direction.DOWN, creatures[0], gameBoard);
                // creatures[0].move(Direction.DOWN);
            } else if (c == 'a') {
                Movehandler.move(Direction.LEFT, creatures[0], gameBoard);
                // creatures[0].move(Direction.LEFT);
            } else if (c == 'd') {
                Movehandler.move(Direction.RIGHT, creatures[0], gameBoard);
                // creatures[0].move(Direction.RIGHT);
            } else {
                Movehandler.move(creatures[0], gameBoard);
                // creatures[0].move();
            }

        }

        scanner.close();
    }

    private static void debug(GameBoard gameBoard, Creature[] creatures) {
        System.err.println("RIGHT:" + gameBoard
                .board()[creatures[0].location().y][creatures[0].location().x
                        + 1]);
        System.err.println("LEFT:" + gameBoard
                .board()[creatures[0].location().y][creatures[0].location().x
                        - 1]);
        System.err.println("DOWN:" + gameBoard.board()[creatures[0].location().y
                + 1][creatures[0].location().x]);
        System.err.println("UP:" + gameBoard.board()[creatures[0].location().y
                - 1][creatures[0].location().x]);
        System.err.println("LOCATION:" + creatures[0].location().x + ","
                + creatures[0].location().y);

    }
}

