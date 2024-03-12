import java.util.List;

public class CustomPolygon {
    private List<Coordinate> coordinates;
    private double perimeter = 0;

    public CustomPolygon(List<Coordinate> coordinates) {
        this.coordinates = coordinates;

        if (coordinates.size() >= 2) {
            for (int i = 0; i < coordinates.size() - 1; i++) {
                perimeter +=
                        coordinates.get(i).calcDistance(coordinates.get(i + 1));
            }
            perimeter += coordinates.get(0)
                    .calcDistance(coordinates.get(coordinates.size() - 1));
        }
    }

    public double getPerimeter() {
        return perimeter;
    }

    public List<Coordinate> getCoordinates() {
        return coordinates;
    }

    public void setCoordinate(Coordinate coordinate) {
        coordinates.add(coordinate);
    }

    public Coordinate calcMiddle() {
        Coordinate middle = new Coordinate(0, 0);

        for (Coordinate c : coordinates) {
            middle.setX(middle.getX() + c.getX());
            middle.setY(middle.getY() + c.getY());
        }

        middle.setX(middle.getX() / coordinates.size());
        middle.setY(middle.getY() / coordinates.size());

        return middle;

    }

}
