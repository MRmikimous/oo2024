public class Movehandler {

    public static void move(Direction direction, Creature creature,
            GameBoard gameBoard) {
        creature.direction(direction);

        switch (direction) {
            case UP: {
                if (gameBoard.board()[creature.location().y - 1][creature
                        .location().x] == 0) {
                    creature.moveUp();
                }
                break;
            }
            case DOWN: {
                if (gameBoard.board()[creature.location().y + 1][creature
                        .location().x] == 0) {
                    creature.moveDown();
                }
                break;
            }
            case LEFT: {
                if (gameBoard
                        .board()[creature.location().y][creature.location().x
                                - 1] == 0) {
                    creature.moveLeft();
                }
                break;
            }
            case RIGHT: {
                if (gameBoard
                        .board()[creature.location().y][creature.location().x
                                + 1] == 0) {
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
