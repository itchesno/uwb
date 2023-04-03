/**
 * Questions
 *
 * Answer the following questions using multi-line comments in your code, at the top. (5%)
 *
 * Q: Can you complete this without using arrays? What is the least number of variables you can use to solve this problem?
 * A: We can use list instead of array and add elements by reading file once.
 *
 * Q: Can you use just one array to solve this? What would the data type be of that array?
 * A: You can use one array which contains Fraction instances with both numerator and denominator as properties.
 *
 * Q: What does it mean to make a class so another class is inside (or part of) the first class, so that it is composed of other data types?  What does "composition" mean in that case?  How is it done?
 * A: We can create inner nested class, to have access to internal properties, and have inner class logically bound to outer class if no plans to use outside. This is more logical composition.
 *
 * Q: What are some solutions to the reduction problem other than Euclid's GCD algorithm?
 * A: You can get both fractions to a common denominator and compare them.
 */
package ichesnokov.uwb.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FractionsApp {
    public static void main(String[] args) {
        String filename = "fractions.txt";
        //String filename = args[0];

        // count number of fractions / lines in input file in order to create array of proper size
        Scanner is = null;
        int count = 0;
        try {
            is = new Scanner(new FileInputStream(filename));
            while (is.hasNext()) {
                count++;
                is.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } finally {
            if (is != null) {
                is.close();
            }
        }

        // open scanner and call count method
        is = null;
        try {
            is = new Scanner(new FileInputStream(filename));
            countFractions(is, count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }  finally {
            if (is != null) {
                is.close();
            }
        }
    }

    public static void countFractions(Scanner is, int count) {
        int[] num = new int[count];
        int[] den = new int[count];
        int index = 0;
        while (is.hasNext()) {
            String line = is.next();
            String[] fraction = line.split("/");
            num[index] = Integer.parseInt(fraction[0]);
            den[index] = Integer.parseInt(fraction[1]);
            index++;
        }

        // count fractions
        for (int i = 0; i < count; i++) {
            if (num[i] == 0) {
                continue;
            }

            int fractionCount = 1;
            for (int j = i + 1; j < count; j++) {
                if (isSameFraction(num[i], den[i], num[j], den[j])) {
                    fractionCount++;
                    num[j] = 0;
                }
            }

            System.out.println(num[i] + "/" + den[i] + " has a count of " + fractionCount);
        }
    }

    // Checks if two given fractions are equal
    public static boolean isSameFraction(int num1, int den1, int num2, int den2) {
        return num1 * den2 == num2 * den1;
    }
}
