public class Circle {
    //variables declared
    private int positionX;
    private int positionY;
    private double radius = 0.0;
    private String shape;

    //constructor
    public Circle(){
        positionX = 0;
        positionY = 0;
        radius = 1.0;
        shape = "O";
    }

    //constructor that takes in x and y
    public Circle(int x, int y){
        positionX = x;
        positionY = y;
        radius = 1.0;
        shape = "O";
    }

    //constructor that takes in x and y as well as radius
    public Circle(int x, int y, double radius){
        positionX = x;
        positionY = y;
        this.radius = radius;
        shape = "O";
    }

    //outputs characters that represent Circle
    public void draw() {
        System.out.println(shape);
    }

    //returns X value
    int getX(){
        int x = positionX;
        return x;
    }

    //returns Y value
    int getY(){
        int y = positionY;
        return y;
    }

    //returns area of the Circle
    double getArea(){
        return 3.14*radius*radius;
    }

    //sets x to nX
    void setX(int nX){
        positionX = nX;
    }

    //sets y to nY
    void setY(int nY){
        positionY = nY;
    }

    //sets radius to r
    void setRadius(double r){
        radius = r;
    }

    //returns characters of shape
    public String toString(){
        String s = shape;
        return shape;
    }
}
