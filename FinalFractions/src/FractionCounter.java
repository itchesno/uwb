import java.util.ArrayList;
//Responsible for parsing through the array and calling the compare method which counts how many repeating values there are
public class FractionCounter {

    //constructor goes through a copy of the array containing all fractions, calls compare method and removes repeating values.
    public ArrayList<Fraction> getNewArray (ArrayList<Fraction> tempArray){
        for (int v = 0; v < tempArray.size(); v++) {
            for (int z = v+1; z < tempArray.size(); z++) {
                if (tempArray.get(v).compare(tempArray.get(z)) == true) {
                    tempArray.remove(z);
                }
            }
        }
        return tempArray;
    }

}
