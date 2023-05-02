import java.awt.*;

/**
 * Implements circle shape with center at (x, y).
 */
public class Circle extends Shape {

    /**
     * Default color of the circle
     */
    public static final Color DEFAULT_COLOR = Color.RED;

    /**
     * Default radius of the circle
     */
    public static final int DEFAULT_RADIUS = 10;

    private int radius;
    private Color color;

    /**
     * Creates circle with default radius and color.
     * @param x x-coord of circle center
     * @param y y-coord of circle center
     */
    public Circle(int x, int y) {
        this(x, y, DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    /**
     * Creates circle with default color.
     * @param x
     * @param y
     * @param radius
     */
    public Circle(int x, int y, int radius) {
        this(x, y, radius, DEFAULT_COLOR);
    }

    /**
     * Creates circle at the passed position, with passed radius and color.
     * @param x
     * @param y
     * @param radius
     * @param color
     */
    public Circle(int x, int y, int radius, Color color) {
        super(x, y);
        this.radius = radius;
        this.color = color;
    }

    /**
     * Returns the radius of the circle.
     * @return radius of circle
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * Returns area of the circle.
     * @return area of the circle
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Draws this circle shape.
     * @param g Graphics to draw the shape
     */
    public void draw(Graphics g) {
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.

        g.setColor(color);

        // circle is oval with width & height equal to 2 * radius
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
