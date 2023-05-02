public class ObjectList {

    private Object[] myShapes = new Object[100];
    private int numElements = 0;

    //adds the Circle or Square to the array of circles
    void add ( Object shape ){
        myShapes[numElements] = shape;
        numElements++;
    }

    //goes through array and making a string of shapes in array
    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += myShapes[i].toString() + " ";
        }
        return retVal;
    }
}
