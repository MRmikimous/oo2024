public class Movehandler {

    public static void move(Direction direction, Creature creature,
            GameBoard gameBoard) {
        creature.setDirection(direction);

        switch (direction) {
            case UP: {
                if (gameBoard.getBoard()[creature.getLocation().y - 1][creature
                        .getLocation().x] == 0) {
                    creature.moveUp();
                }
                break;
            }
            case DOWN: {
                if (gameBoard.getBoard()[creature.getLocation().y + 1][creature
                        .getLocation().x] == 0) {
                    creature.moveDown();
                }
                break;
            }
            case LEFT: {
                if (gameBoard.getBoard()[creature.getLocation().y][creature
                        .getLocation().x - 1] == 0) {
                    creature.moveLeft();
                }
                break;
            }
            case RIGHT: {
                if (gameBoard.getBoard()[creature.getLocation().y][creature
                        .getLocation().x + 1] == 0) {
                    creature.moveRight();
                }
                break;
            }
            default:
                throw new IllegalArgumentException("No direction");
        }
    }

    public static void move(Creature creature, GameBoard gameBoard) {
        Movehandler.move(creature.getDirection(), creature, gameBoard);
    }
}
