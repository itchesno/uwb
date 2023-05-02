import java.awt.*;

/**
 * Class responsible for creating a snowman picture
 */
public class Snowman extends Shape {

    // ratio to get size of top/bottom circles, 1.0 for middle
    private static final double RATIO = 1.5;

    // bottom/top of hat ratio
    private static final double HAT_RATIO = 1.3;

    // nose height to radius ratio
    private static final double NOSE_HEIGHT_RATIO = 0.4;

    // nose length to radius ratio
    private static final double NOSE_LENGTH_RATIO = 0.8;

    // hat color
    private static final Color HAT_COLOR = new Color(150, 75, 0);

    private int radius;

    /**
     * constructor which takes in x and y coordinates as well as a radius
     * @param x
     * @param y
     * @param radius
     */
    public Snowman(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    /**
     * Rough approximation of snowman area - 3 circles + hat.
     *
     * @return approximation of area
     */
    public double getArea() {
        double circlesArea = Math.PI * radius * radius * (1 + 1 / (RATIO * RATIO) + 1 * RATIO * RATIO);

        // trapezoid; bottom = 2 * radius-of-top; top = bottom / HAT_RATIO; height = radius-of-top
        double radiusOfTop = radius / RATIO;
        double bottom = 2 * radiusOfTop;
        double top = bottom / HAT_RATIO;
        double hatArea = (top + bottom) * radiusOfTop / 2;

        return circlesArea + hatArea;
    }

    /**
     * draws a snowman
     * @param g
     */
    public void draw(Graphics g) {
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.

        g.setColor(Color.CYAN);

        // middle of snowman
        drawCircle(g, x, y, radius);

        // top of snowman
        drawCircle(g, x, y - (int)(radius + radius / RATIO), (int)(radius / RATIO));

        // bottom of snowman
        drawCircle(g, x, y + (int)(radius + radius * RATIO), (int)(radius * RATIO));

        // hat, hands, nose
        g.setColor(HAT_COLOR);
        drawHat(g, x, y - (int)(radius + 2 * radius / RATIO), (int) (radius / RATIO));
        drawHands(g, x, y, radius);
        g.setColor(Color.RED);
        drawNose(g, x, y - (int)(radius + radius / RATIO), (int)(radius / RATIO));
    }

    private static void drawCircle(Graphics g, int x, int y, int radius) {
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }

    // x, y is center of bottom of hat; size is bottom/height of hat
    private static void drawHat(Graphics g, int x, int y, int size) {
        int[] px = new int[4];
        int[] py = new int[4];

        // left bottom
        px[0] = x - (int) (size / 2);
        py[0] = y;

        // right bottom
        px[1] = x + (int) (size / 2);
        py[1] = y;

        // right up
        px[2] = px[1] - (int)(size * (HAT_RATIO - 1) / 2);
        py[2] = y - size;

        // left up
        px[3] = px[0] + (int)(size * (HAT_RATIO - 1) / 2);
        py[3] = y - size;

        g.fillPolygon(px, py, 4);
    }

    private static void drawHands(Graphics g, int x, int y, int radius) {
        g.drawLine(x - radius, y, x - 2 * radius, y + (int)(radius * Math.sin(Math.PI / 3)));
        g.drawLine(x + radius, y, x + 2 * radius, y + (int)(radius * Math.sin(Math.PI / 3)));
    }

    private static void drawNose(Graphics g, int x, int y, int radius) {
        int[] px = new int[3];
        int[] py = new int[3];

        // up
        px[0] = x;
        py[0] = y - (int)(radius * NOSE_HEIGHT_RATIO / 2);

        // bottom
        px[1] = x;
        py[1] = y + (int)(radius * NOSE_HEIGHT_RATIO / 2);

        // right
        px[2] = x + (int)(radius * +NOSE_LENGTH_RATIO);
        py[2] = y + (int)(radius * NOSE_HEIGHT_RATIO / 2);

        g.fillPolygon(px, py, 3);
    }
}
