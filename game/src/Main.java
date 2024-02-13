import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard(new int[5][10]);

        Creature[] creatures = new Creature[2];
        creatures[0] = new Creature("Player 1", 'o', new Location(2, 3));
        creatures[1] = new Creature("Player 2", 'o', new Location(3, 2));

        Scanner userMove = new Scanner(System.in);
        boolean exit = false;

        System.err.println(gameBoard.stringify(creatures));
        while (exit == false) {
            char c = userMove.next().charAt(0);

            if (c == 'q') {
                exit = true;
            } else if (c == 'w') {
                creatures[0].moveUp();
            } else if (c == 's') {
                creatures[0].moveDown();
            } else if (c == 'a') {
                creatures[0].moveLeft();
            } else if (c == 'd') {
                creatures[0].moveRight();
            }

            System.err.println(gameBoard.stringify(creatures));
        }
    }
}
