public class LineSegment {

    //What is a privacy leak?
    //when other parts of the code affect others unintentionally

    //Do your getters or setters have privacy leaks?
    //no

    //Where else could a privacy leak occur?
    //constructor

    //variables
    private Point2D start;
    private Point2D end;

    //constructors
    public LineSegment(){
        setStartPoint(new Point2D(0, 0));
        setEndPoint((new Point2D(0, 0)););
    }

    public LineSegment(Point2D start, Point2D end){
        setStartPoint(start);
        setEndPoint(end);
    }

    public LineSegment(LineSegment seg) {
        setStartPoint(seg.getStartPoint());
        setEndPoint(seg.getStartPoint());
    }

    //getters and setters

    //returns start point
    public Point2D getStartPoint() {
        return this.start;
    }
    //returns end point
    public Point2D getEndPoint(){
        return this.end;
    }

    //sets start point
    public void setStartPoint(Point2D point){
        this.start = new Point2D(point);
    }

    //sets end point
    public void setEndPoint(Point2D point){
        this.end = new Point2D(point);
    }

    //turns points info to string
    public String toString(){
        return "Line start" + getStartPoint().toString() + "and end " + getEndPoint().toString();
    }

    //checks if two line segments are equal
    public boolean equals(LineSegment line){
        if (this.start == line.getStartPoint() && this.end == line.getEndPoint()){
            return true;
        }
        return false;
    }

    //checks distance of line
    public double distance(){
        return Math.sqrt((end.getY() - start.getY()) * (end.getY() - start.getY()) + (end.getX() - start.getX()) * (end.getX() - start.getX()));
    }

}
