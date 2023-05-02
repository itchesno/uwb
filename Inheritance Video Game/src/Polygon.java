import java.awt.*;

/**
 * Class responsible for creation of a polygon
 *
 */
public class Polygon extends Shape {

    /**
     * default color of the polygon
     */
    public static final Color DEFAULT_COLOR = Color.RED;

    /**
     * default radius of the polygon
     */
    public static final int DEFAULT_RADIUS = 10;

    /**
     * default number of angles of the polygon
     */
    private static final int DEFAULT_ANGLE_COUNT = 5;

    private int radius;
    private int angleCount;
    private Color color;

    /**
     * Constructor which takes in coordinates of a polygon
     * @param x
     * @param y
     */
    public Polygon(int x, int y) {
        this(x, y, DEFAULT_RADIUS, DEFAULT_ANGLE_COUNT, DEFAULT_COLOR);
    }

    /**
     * Constructor which takes in coordinates of a polygon as well as it's radius
     *
     * @param x
     * @param y
     * @param radius
     */

    public Polygon(int x, int y, int radius) {
        this(x, y, radius, DEFAULT_ANGLE_COUNT, DEFAULT_COLOR);
    }

    /**
     * Constructor which takes in x and y coordinates as well as radius, color and angle count
     * @param x
     * @param y
     * @param radius
     * @param angleCount
     * @param color
     */
    public Polygon(int x, int y, int radius, int angleCount, Color color) {
        super(x, y);
        this.radius = radius;
        this.angleCount = angleCount;
        this.color = color;
    }

    /**
     * Very rough approximation of polygon area.
     *
     * @return approximation of area
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * takes in a graphics objects and draws a polygon
     * @param g
     */
    public void draw(Graphics g) {
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.

        g.setColor(color);

        int[] px = new int[angleCount];
        int[] py = new int[angleCount];

        // for loop which adds the x and y coordinates to corresponding lists which are then used to draw a polygon
        for (int i = 0; i < angleCount; i++) {
            double angle = (2.0 * Math.PI / angleCount) * i;
            int currentX = x + (int)(Math.cos(angle) * radius);
            int currentY = y + (int)(Math.sin(angle) * radius);
            px[i] = currentX;
            py[i] = currentY;
        }

        g.drawPolygon(px, py, angleCount);
    }
}
