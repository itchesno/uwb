public class CharList {

    //variable
    private char [] charlist = new char[100];
    private int numberOfChars = 0;

    //constructors
    public CharList(){
    }

    public CharList(String startStr){
        this.charlist = startStr.toCharArray();
    }

    //copy constructor
    public CharList(CharList other){
        this.charlist = other.getList();
        this.numberOfChars = other.getNOC();
    }

    //other methods

    //adds a char to the end of the list
    public void add(char next){
        this.charlist[this.numberOfChars] = next;
        numberOfChars += 1;
    }

    //returns char at certain index
    public char get(int index){
        return this.charlist[index];
    }

    //returns string formed from all chars
    public String toString(){
        String string = "";
        int i = this.numberOfChars;
        while(i >= 0){
            string += charlist[i];
            i--;
        }
        return string;
    }

    //returns number of chars
    public int getNOC(){
        return this.numberOfChars;
    }

    //returns charlist
    public char [] getList(){
        return this.charlist;
    }

}
