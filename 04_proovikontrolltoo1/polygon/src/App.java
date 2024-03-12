import java.util.ArrayList;
import java.util.List;
import java.awt.Frame;

public class App {
    public static void main(String[] args) throws Exception {
        List<Coordinate> coordinates = new ArrayList<Coordinate>();
        coordinates.add(new Coordinate(200, 100));
        coordinates.add(new Coordinate(300, 300));
        coordinates.add(new Coordinate(100, 300));
        // coordinates.add(new Coordinate(100, 100));

        CustomPolygon polygon = new CustomPolygon(coordinates);

        System.out.println(polygon.getPerimeter());
        System.out.println(polygon.getCoordinates());

        Frame frame = new Frame();
        frame.add(new Draw(polygon));

        int frameWidth = 800;
        int frameHeight = 800;
        frame.setSize(frameWidth, frameHeight);
        frame.setVisible(true);

    }
}
