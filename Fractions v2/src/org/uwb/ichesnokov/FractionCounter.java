package org.uwb.ichesnokov;

import java.util.ArrayList;


public class FractionCounter {

    //constructor goes through a copy of the array containing all fractions, calls compare method and removes repeating values
    public ArrayList<Fraction> getNewArray (ArrayList<Fraction> tempArray){
        int v = 0;
        int z = 1;
        while (v < tempArray.size()) {
            while (z < tempArray.size()) {
                if (tempArray.get(v).compare(tempArray.get(z))) {
                    tempArray.remove(z);
                }
                else{
                    z++;
                }
            }
            z = 0;
            v++;
        }
        return tempArray;
    }

}
