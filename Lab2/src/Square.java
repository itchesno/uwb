public class Square {
    //variables declared
    private int positionX;
    private int positionY;
    private double sideLength = 0.0;
    private String shape;

    //constructor
    public Square(){
        positionX = 0;
        positionY = 0;
        sideLength = 1.0;
        shape = "[]";
    }

    //constructor that takes in x and y
    public Square(int x, int y){
        positionX = x;
        positionY = y;
        sideLength = 1.0;
        shape = "[]";
    }

    //constructor that takes in x and y as well as side length
    public Square(int x, int y, double length){
        positionX = x;
        positionY = y;
        sideLength = length;
        shape = "[]";
    }

    //outputs characters that represent square
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

    //returns Side length value
    double getSideLength(){
        double l = sideLength;
        return l;
    }

    //returns area of the square
    double getArea(){
        return sideLength*sideLength;
    }

    //sets x to nX
    void setX(int nX){
        positionX = nX;
    }

    //sets y to nY
    void setY(int nY){
        positionY = nY;
    }

    //sets sideLength to sl
    void setSideLength(double sl){
        sideLength = sl;
    }

    //returns characters of shape
    public String toString(){
        String s = shape;
        return shape;
    }

    //checks if Square equals that Square
    public boolean equals(Square that) {
        if (that.getX() == positionX && that.getY() == positionY && that.getSideLength() == sideLength){
            return true;
        }
        return false;
    }
}
