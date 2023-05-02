import java.awt.*;

public class Shape {

    //variables
    private int x;
    private int y;
    private Color color;

    //constructors
    public Shape(){
        this.x = 1;
        this.y = 2;
        this.color = Color.cyan;
    }

    public Shape(int x, int y, Color color){
        this.x = x;
        this.y = y;
        this.color = new Color (color.getRed(), color.getGreen(), color.getBlue());
    }

    //copy constructor
    public Shape(Shape other){
        this.x = other.getX();
        this.y = other.getY();
        this.color = new Color (other.getColor().getRed(), other.getColor().getGreen(), other.getColor().getBlue());
    }

    //other methods

    //describe your shape’s x,y, color, etc.
    public String toString(){
        return ("x: " + x + " y: " + " color: " + color.toString());
    }

    //to be replaced by subclasses, return -1 here
    public double getArea(){
        return Math.abs(x*y);
    }

    //to be used by the paint program, empty for now
    public void draw(Graphics g){

    }

    //get x value
    public int getX(){
        return this.x;
    }

    //gets y value
    public int getY(){
        return this.y;
    }

    //gets color object
    public Color getColor(){
        return this.color;
    }

}
