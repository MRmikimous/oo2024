public class Creature {
    private String _name;
    private char _symbol;
    private Location _location;
    private Direction _direction = Direction.UP;

    public Creature(String name, char symbol, Location location) {
        this._name = name;
        this._symbol = symbol;
        this._location = location;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Location getLocation() {
        return _location;
    }

    public void setLocation(Location location) {
        this._location = location;
    }

    public char getSymbol() {
        return _symbol;
    }

    public void setSymbol(char symbol) {
        this._symbol = symbol;
    }

    public void moveUp() {
        this._location.y--;
    }

    public void moveDown() {
        this._location.y++;
    }

    public void moveLeft() {
        this._location.x--;
    }

    public void moveRight() {
        this._location.x++;
    }

    public void move(Direction direction) {
        this._direction = direction;

        switch (direction) {
            case UP -> this.moveUp();
            case DOWN -> this.moveDown();
            case LEFT -> this.moveLeft();
            case RIGHT -> this.moveRight();
        }
    }

    public void move() {
        this.move(this._direction);
    }

    public Direction getDirection() {
        return _direction;
    }

    public void setDirection(Direction direction) {
        this._direction = direction;
    }

}
