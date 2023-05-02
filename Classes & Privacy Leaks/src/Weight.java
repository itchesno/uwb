/**
 * Weight class:
 * This represents Weight
 *
 * @author Ivan Chesnokov
 */

public class Weight {

    //instance variables
    private int ounces;
    private int pounds;

    //Methods

    //Constructors

    /**Sets pounds to a given value and ounces to zero (if given value is negative, the program treats it as a mistake and turns it positive)
     *
     * @param lbs
     */
    public Weight(int lbs){
        this.pounds = Math.abs(lbs);
        this.ounces = 0;
    }

    /**Sets pounds and ounces to given values (if given values are negative, the program treats it as a mistake and turns them positive)
     *
     * @param lbs
     * @param oz
     */
    public Weight(int lbs, int oz){
        this.pounds = Math.abs(lbs);
        if(oz <= 15){
            this.ounces = Math.abs(oz);
        }
        else{
            this.ounces = 15;
        }
    }

    /**copy constructor
     *
     * @param other
     */
    public Weight(Weight other){
        this.pounds = other.getPounds();
        this.ounces = other.getOunces();
    }

    //Getters & Setters

    /**Returns pounds value of the object
     *
     * @return
     */
    public int getPounds(){
        return this.pounds;
    }

    /**Returns ounces value of the object
     *
     * @return
     */
    public int getOunces(){
        return this.ounces;
    }

    /**Sets pounds value of the object (if given value is negative, the program treats it as a mistake and turns it positive)
     *
     * @param lbs
     */
    public void setPounds(int lbs){
        this.pounds = Math.abs(lbs);
    }

    /**Sets ounces value of the object (if given value is negative, the program treats it as a mistake and turns it positive)
     *
     * @param oz
     */
    public void setOunces(int oz){
        if(oz < 15){
            this.ounces = Math.abs(oz);
        }
        else{
            this.ounces = 15;
        }
    }

    /**Returns the weight as a double
     *
     * @return
     */
    public double getWeight(){
        double oz = this.ounces;
        return this.pounds + oz/16;
    }

    /**Sets pounds and ounces
     *
     * @param lbs
     * @param oz
     */
    public void setWeight(int lbs, int oz){
        this.setPounds(lbs);
        this.setOunces(oz);
    }

    //Other methods

    /**adds to pounds
     *
     * @param lbs
     */
    public void add(int lbs){
        if(this.pounds + lbs < 0){
            System.out.println("Error! Pounds cannot be negative.");
        }
        else{
            this.pounds += lbs;
        }
    }

    /** adds pounds and ounces
     *
     * @param lbs
     * @param oz
     */
    public void add(int lbs, int oz){
        if(this.pounds + lbs < 0){
            System.out.println("Error! Pounds cannot be negative.");
        }
        else{
            this.pounds += lbs;
        }
        if (this.ounces + oz < 0){
            System.out.println("Error! Ounces cannot be negative.");
        }
        else if(this.ounces + oz <= 15){
            this.ounces += oz;
        }
        else{
            this.ounces += oz;
            while (oz > 15){
                this.pounds += 1;
                this.ounces -= 16;
            }
        }
    }

    /**Adds the weight of another object
     *
     * @param other
     */
    public void add(Weight other){
        int otherPounds = other.getPounds();
        int otherOunces = other.getOunces();
        if(this.pounds + otherPounds < 0){
            System.out.println("Error! Pounds cannot be negative.");
        }
        else{
            this.pounds += otherPounds;
        }
        if (this.ounces + otherOunces < 0){
            System.out.println("Error! Ounces cannot be negative.");
        }
        else if(this.ounces + otherOunces <= 15){
            this.ounces += otherOunces;
        }
        else{
            this.ounces += otherOunces;
            while (otherOunces > 15){
                this.pounds += 1;
                this.ounces -= 16;
            }
        }
    }

    /**compares two weight objects
     *
     * @param o
     * @return
     */
    public boolean equals(Weight o){
        if(this.pounds == o.getPounds() && this.ounces == o.getOunces()){
            return true;
        }
        return false;
    }

    /**returns string representation of a Weight object
     *
     * @return
     */
    public String toString(){
        return this.pounds + " lbs. " + this.ounces + " oz";
    }
}
