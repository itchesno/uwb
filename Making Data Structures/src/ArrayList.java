
public class ArrayList {
    //declares array
    Object[] Array;

    //constructor with given length
    public ArrayList(int length){
        Array = new Object[length];
    }
    //constructor without given length
    public ArrayList(){
        Array = new Object[0];
    }

    //inserts new value into an array at a certain index
    public void insert(Object AnArray, int index){
        int indexNotPassed = 0;
        Object[] NewArray = new Object[size() + 1];
        for(int i = 0; i < size(); i++){
            if (i == index && indexNotPassed == 0){
                NewArray[i] = AnArray;
                indexNotPassed = 1;
            }
            else if (indexNotPassed == 1){
                NewArray[i] = Array[i - 1];
            }
            else{
                NewArray[i] = Array[i];
            }
        }
    }

    //removes an item from an array at a certain index
    public Object remove(int index){
        int indexNotPassed = 0;
        Object[] NewArray = new Object[size() - 1];
        for(int i = 0; i < size(); i++){
            if (i == index && indexNotPassed == 0){
                indexNotPassed = 1;
            }
            else if (indexNotPassed == 1){
                NewArray[i] = Array[i - 1];
            }
            else{
                NewArray[i] = Array[i];
            }
        }
        return Array;
    }

    //adds a new object to the end of the array
    public void add(Object x){
        Object[] NewArray = new Object[size() + 1];
        int v = 0;
        for(int i = 0; i < size(); i++){
            NewArray[i] = Array[i];
            v++;
        }
        NewArray[v+1] = x;
    }

    //returns the size of the array
    public int size(){
        return Array.length;
    }

    //turns contents of array to a string
    public String toString(){
        String list = "";

        for(int i = 0; i < size(); i++){
            list += (Array[i].toString() + ", ");
        }
        return list;
    }

    //checks if array is empty
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }
        return false;
    }

    //finds the index of z in the array, returns -1 if z isn't found
    public int indexOf(Object z){
        for(int i = 0; i < size(); i++){
            if(Array[i] == z){
                return i;
            }
        }
        System.out.println("Object not found");
        return -1;
    }

    //checks if all items in the array are equal
    public boolean equals(ArrayList k){
        for (int i = 1; i < k.size(); i++){
            if (k.get(0).equals(k.get(i)) == false){
                return false;
            }
        }
        return true;
    }

    //returns a value at a cerain index of the array
    public Object get(int index){
        return Array[index];
    }
}
