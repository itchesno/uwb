public class Point2D {


    private int x;
    private int y;

    //constructor
    public Point2D (){
        this.x = 0;
        this.y = 0;
    }

    public Point2D (int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point2D (Point2D point){
        this.x = point.getX();
        this.y = point.getX();
    }

    //sets x
    public void setX(int nX){
        x = nX;
    }

    //sets y
    public void setY(int nY){
        y = nY;
    }

    //gets x
    public int getX(){
        int newX = x;
        return newX;
    }

    //gets y
    public int getY(){
        int newY = y;
        return newY;
    }

    //sets both x and y to zero
    public void resetToOrigin() {
        setX(0);
        setY(0);
    }

    //adds dx and dy to x and y respectively
    public void translate(int dx, int dy) {
        x=+dx;
        y=+dy;
    }

    //returns x and y in string form
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //Checks if two points are the same
    public boolean equals(Point2D that) {
        if (that == this){
            return true;
        }
        return false;
    }

}
