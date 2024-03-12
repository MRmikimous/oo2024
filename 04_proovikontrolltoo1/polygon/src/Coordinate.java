public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calcDistance(Coordinate c) {
        return Math.hypot(x - c.getX(), y - c.getY());
    }

    public Coordinate calcMiddle(Coordinate c) {
        return new Coordinate((x + c.getX()) / 2, (y + c.getY()) / 2);
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
