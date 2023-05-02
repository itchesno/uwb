
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Responsible for running the program, parces through a txt file and creates an array of fraction objects which it then simplifies
public class FractionDriver {
    static ArrayList<Fraction> list = new ArrayList<Fraction>();
    //main method responsible for running the program
    public static void main(String[] args) {
        String filename = "fractions.txt";
        Scanner is = null;
        FractionCounter counter = new FractionCounter();

        try {
            is = new Scanner(new FileInputStream(filename));
            countFractions(is);
            simplify();
            list = counter.getNewArray(list);
            for (int i = 0; i < list.size(); i++){
                System.out.println(list.get(i).getNumerator() + "/" + list.get(i).getDenominator() + " has a count of " + list.get(i).getCount());
            }
        } catch (FileNotFoundException var15) {
            System.out.println("File not found!");
        } finally {
            if (is != null) {
                is.close();
            }

        }
    }
    //This method is responsible for reading the txt file, creating new fraction objects and populating a new array
    public static void countFractions(Scanner is) {

        while (is.hasNextLine()){
            String line = is.next();
            var stringFraction = line.split("/");
            int num = Integer.parseInt(stringFraction[0]);
            int den = Integer.parseInt(stringFraction[1]);
            Fraction fraction = new Fraction(num, den);
            list.add(fraction);
        }

    }

    //simplifies fractions in the list
    public static void simplify(){
        for (int i = 0; i < list.size(); i++){
            int gcd = 0;
            int numerator = list.get(i).getNumerator();
            int denominator = list.get(i).getDenominator();
            //greatest common denominator finder
            for (int v = 1; v <= numerator && v <= denominator; v++){
                if (numerator % v == 0 && denominator % v == 0){
                    gcd = v;
                }
            }
            list.get(i).setNumerator(numerator/gcd);
            list.get(i).setDenominator(denominator/gcd);
        }
    }
}
