
/**
 * DateWeightYoungHumanDriver class:
 * This is used to test the Date, Weight, and YoungHuman classes
 *
 * @author David Nixon
 * @version 2021
 */
public class DateWeightYoungHumanDriver
{
    /** tests the program
     *
     * @param args
     */
    public static void main(String [] args){
        /* *** DATE TESTS:  *** */
        System.out.println("Date tests:");
        System.out.println("-----------");
        // construct some date objects and do some tests:
        Date d1 = new Date(6,7,2005);
        System.out.println("Testing getMonth(). Should print 6:  " + d1.getMonth());
        // now add many more tests!
        Date d2 = new Date(d1);
        System.out.println("New date tests: ");
        System.out.println(d2.getDay());
        System.out.println(d2.getYear());
        System.out.println(d2.getMonth());
        System.out.println(d2.equals(d1));
        System.out.println(d2.toString());

        /* *** WEIGHT TESTS:  *** */
        System.out.println("Weight tests:");
        System.out.println("-------------");
        // construct some Weight objects and do some tests:
        Weight w1 = new Weight(14,8);
        System.out.println("Testing getWeight(). Should print 14.5: " +w1.getWeight());
        // now add many more tests!
        Weight w2 = new Weight(w1);
        System.out.println("New weight tests: ");
        System.out.println(w2.getOunces());
        System.out.println(w2.getPounds());
        System.out.println(w2.getWeight());
        System.out.println(w2.equals(w1));
        System.out.println(w2.toString());

        
        /* *** YOUNGHUMAN TESTS:  *** */
        System.out.println("YoungHuman tests:");
        System.out.println("-----------------");
        // construct some YoungHuman objects and do some tests:
        YoungHuman y1 = new YoungHuman(w1, d1, "Homer", "Simpson");
        System.out.print("Testing getName(): ");
        if (y1.getName().equals("Homer Simpson"))
            System.out.println(" TEST PASSED! :) ");
        else System.out.println(" TEST FAILED!  :( ");
        // now add many more tests!
        Date dy = new Date(8,2,2015);
        Weight wy = new Weight(12,3);
        YoungHuman y2 = new YoungHuman(wy, dy, "Bob", "Clark");
        System.out.println("New Young Human tests: ");
        System.out.println(y2.getName());
        System.out.println(y2.getBirthDate());
        System.out.println(y2.getWeight());
        System.out.println(y2.equals(y1));
        y2.hasHadCheckUp();
        Date checkup = new Date(3, 5, 2022);
        y2.setCheckUp(checkup);
        System.out.println(y2.toString());

    }
}
