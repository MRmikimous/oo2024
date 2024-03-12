import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class Draw extends Component {
    private CustomPolygon customPolygon;

    public Draw(CustomPolygon cp) {
        customPolygon = cp;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        Polygon polygon = new Polygon();

        for (Coordinate c : customPolygon.getCoordinates()) {
            polygon.addPoint(c.getX(), c.getY());
        }

        for (int i = 0; i < customPolygon.getCoordinates().size() - 1; i++) {
            Coordinate lineMiddle = customPolygon.getCoordinates().get(i)
                    .calcMiddle(customPolygon.getCoordinates().get(i + 1));

            double distance = customPolygon.getCoordinates().get(i)
                    .calcDistance(customPolygon.getCoordinates().get(i + 1));

            g2d.drawString(String.format("%.2f", distance),
                    lineMiddle.getX() - 5, lineMiddle.getY() - 5);
        }

        Coordinate lineMiddle = customPolygon.getCoordinates().get(0)
                .calcMiddle(customPolygon.getCoordinates()
                        .get(customPolygon.getCoordinates().size() - 1));

        double distance = customPolygon.getCoordinates().get(0)
                .calcDistance(customPolygon.getCoordinates()
                        .get(customPolygon.getCoordinates().size() - 1));

        g2d.drawString(String.format("%.2f", distance), lineMiddle.getX() - 5,
                lineMiddle.getY() - 5);

        Coordinate cpMiddle = customPolygon.calcMiddle();
        g2d.drawString(String.format("%.2f", customPolygon.getPerimeter()),
                cpMiddle.getX() - 5, cpMiddle.getY() - 5);

        g2d.drawPolygon(polygon);
    }
}
