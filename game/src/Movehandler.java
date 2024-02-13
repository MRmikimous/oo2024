public class Movehandler {

    public static void move(Direction direction, Creature creature,
            GameBoard gameBoard) {
        creature.direction(direction);

        switch (direction) {
            case UP: {
                if (creature.location().y > 1) {
                    creature.moveUp();
                }
                break;
            }
            case DOWN: {
                if (creature.location().y < gameBoard.board().length - 2) {
                    creature.moveDown();
                }
                break;
            }
            case LEFT: {
                if (creature.location().x > 1) {
                    creature.moveLeft();
                }
                break;
            }
            case RIGHT: {
                if (creature.location().x < gameBoard.board()[0].length - 2) {
                    creature.moveRight();
                }
                break;
            }
            default:
                throw new IllegalArgumentException("No direction");
        }
    }

    public static void move(Creature creature, GameBoard gameBoard) {
        Movehandler.move(creature.direction(), creature, gameBoard);
    }
}
