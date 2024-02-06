import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();
        gameBoard.board(new int[5][10]);

        Creature[] creatures = new Creature[2];
        creatures[0] = new Creature();
        creatures[1] = new Creature();

        creatures[0].name("Player 1");
        creatures[0].symbol('o');
        creatures[0].location(new Location(2, 3));

        creatures[1].name("Player 2");
        creatures[1].symbol('x');
        creatures[1].location(new Location(3, 2));

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
