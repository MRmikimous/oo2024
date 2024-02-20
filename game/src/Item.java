public class Item {
    private String _name;
    private char _symbol = 'T';
    private Location _location;

    private int _strength;
    private int _uses = 1;

    private boolean _active = true;

    public Item(String _name, int _strength, int _uses, Location _location) {
        this._name = _name;
        this._strength = _strength;
        this._uses = _uses;
        this._location = _location;
    }

    public String getName() {
        return _name;
    }

    public char getSymbol() {
        return _symbol;
    }

    public int geStrength() {
        return _strength;
    }

    public int getUses() {
        return _uses;
    }

    public boolean isActive() {
        return _active;
    }

    public void setActive(boolean _active) {
        this._active = _active;
    }

    public Location getLocation() {
        return _location;
    }
}
