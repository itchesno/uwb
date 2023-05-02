import java.awt.*;

/**
 * Star shape formed by few right triangles rotated by 2 * PI / count.
 */
public class TriangleStar extends Shape {

    /**
     * Default color for Triangle Star.
     */
    public static final Color DEFAULT_COLOR = Color.RED;

    private static final int DEFAULT_RADIUS = 10;
    private static final int DEFAULT_COUNT = 3;

    private int radius;
    private int count;
    private Color color;

    /**
     * Constructor which takes in x and y coordinates of the star
     * @param x
     * @param y
     */
    public TriangleStar(int x, int y) {
        this(x, y, DEFAULT_RADIUS, DEFAULT_COUNT, DEFAULT_COLOR);
    }

    public TriangleStar(int x, int y, int radius) {
        this(x, y, radius, DEFAULT_COUNT, DEFAULT_COLOR);
    }

    public TriangleStar(int x, int y, int radius, int count, Color color) {
        super(x, y);
        this.radius = radius;
        this.count = count;
        this.color = color;
    }

    /**
     * Very rough approximation of polygon area.
     *
     * @return approximation of shape area
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw(Graphics g) {
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.

        g.setColor(color);

        for (int i = 0; i < count; i++) {
            double angle = (2.0 * Math.PI / count) * i;
            drawRightTriangle(g, x, y, angle);
        }
    }

    private void drawRightTriangle(Graphics g, int x, int y, double angle) {
        int[] px = new int[3];
        int[] py = new int[3];
        for (int i = 0; i < 3; i++) {
            double currentAngle = angle + (2.0 * Math.PI / 3) * i;
            int currentX = x + (int)(Math.cos(currentAngle) * radius);
            int currentY = y + (int)(Math.sin(currentAngle) * radius);
            px[i] = currentX;
            py[i] = currentY;
        }
        g.drawPolygon(px, py, 3);
    }
}
