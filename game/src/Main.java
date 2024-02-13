import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(new int[5][10]);

        Creature[] creatures = new Creature[2];
        creatures[0] = new Creature("Player 1", 'x', new Location(2, 3));
        creatures[1] = new Creature("Player 2", 'o', new Location(3, 2));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (exit == false) {
            System.err.println(gameBoard.stringify(creatures));
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
}
