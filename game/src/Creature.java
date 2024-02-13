public class Creature {
    private String _name;
    private char _symbol;
    private Location _location;
    private Direction _direction;

    public Creature(String name, char symbol, Location location) {
        this._name = name;
        this._symbol = symbol;
        this._location = location;
    }

    public String name() {
        return _name;
    }

    public void name(String name) {
        this._name = name;
    }

    public Location location() {
        return _location;
    }

    public void location(Location location) {
        this._location = location;
    }

    public char symbol() {
        return _symbol;
    }

    public void symbol(char symbol) {
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

    public Direction direction() {
        return _direction;
    }

    public void direction(Direction direction) {
        this._direction = direction;
    }

}
