public class Point2D {
    //What effect does “private” have for methods trying to use x or y inside this class file?
    //They cannot be used outside of this class
    //What about methods trying to use x and y outside this class?
    //The cannot use x or y outside this class without getter method
    //Can you use x and y without an associated object (or instance)?
    //No you cannot

    private int x;
    private int y;

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
        return "X: " + x + " Y: " + y;
    }

    //Checks if two points are the same
    public boolean equals(Point2D that) {
        if (that == this){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() );
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); //Question: why don’t I need c.toString() here?
        System.out.println("Are b and c equal:" + b.equals(c));
    }
}
