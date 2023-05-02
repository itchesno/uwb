import java.awt.*;

/**
 * Class responsible for creation of a circle
 */
public class Circle extends Shape {

    /**
     * default color of the circle
     */
    public static final Color DEFAULT_COLOR = Color.RED;

    /**
     * default radius of the circle
     */
    public static final int DEFAULT_RADIUS = 10;

    private int radius;
    private Color color;

    /**
     * constructor which takes in an x and y coordinate
     * @param x
     * @param y
     */
    public Circle(int x, int y) {
        this(x, y, DEFAULT_RADIUS, DEFAULT_COLOR);
    }

    /**
     * constructor which takes in x and y coordinates as well as a radius
     * @param x
     * @param y
     * @param radius
     */
    public Circle(int x, int y, int radius) {
        this(x, y, radius, DEFAULT_COLOR);
    }

    /**
     * constructor which takes in x and y coordinates as well as radius and color
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
     * returns the radius of the circle
     * @return
     */
    public int getRadius() {
        return this.radius;
    }

    /**
     * returns area of the circle
     * @return
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * takes in a graphic object and draws a circle
     * @param g
     */
    public void draw(Graphics g) {
        int x = getX();   // the center of the star is
        int y = getY();   // at these coordinates.

        g.setColor(color);

        // circle is oval with width & height equal to 2 * radius
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
    }
}
