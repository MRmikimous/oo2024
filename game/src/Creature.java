public class Creature {
    private String _name;
    private char _symbol;
    private Location _location;

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
}
