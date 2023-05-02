/**
 * Date class:
 * This represents the Date
 *
 * @author Ivan Chesnokov
 */

public class Date {
    //instance variables
    private int month;
    private int day;
    private int year;

    //constructors

    /** Constructor with day, year and month
     *
     * @param m
     * @param d
     * @param y
     */
    public Date(int m, int d, int y){
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    /**copy constructor
     *
     * @param other
     */
    public Date(Date other){
        this.month = other.getMonth();
        this.day = other.getDay();
        this.year = other.getYear();
    }

    //setters

    /** sets date
     *
     * @param m
     * @param d
     * @param y
     */
    public void setDate(int m, int d, int y){
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    /** sets month
     *
     * @param m
     */
    public void setMonth(int m){
        if (m >= 1 && m <= 12){
            this.month = m;
        }
        else{
            System.out.println("Date error, month set to 1");
            this.month = 1;
        }
    }

    /** sets day
     *
     * @param d
     */
    public void setDay(int d){
        if (d >= 1 && d <= 31){
            this.day = d;
        }
        else{
            System.out.println("Date error, day set to 1");
            this.day = 1;
        }
    }

    /** sets year
     *
     * @param y
     */
    public void setYear(int y){
        if (y >= 2014 && y <= 2024){
            this.year = y;
        }
        else{
            System.out.println("Date error, year set to 2014");
            this.year = 2014;
        }
    }

    //getters

    /** returns month value
     *
     * @return
     */
    public int getMonth(){
        return this.month;
    }

    /** returns day value
     *
     * @return
     */
    public int getDay(){
        return this.day;
    }

    /** returns year value
     *
     * @return
     */
    public int getYear(){
        return this.year;
    }

    /** compares if two dates are equal
     *
     * @param other
     * @return
     */
    public boolean equals(Date other){
        if(this.month == other.getMonth() && this.day == other.getDay() && this.year == other.getYear()){
            return true;
        }
        return false;
    }

    /** returns date in string form
     *
     * @return
     */
    public String toString(){
        return this.month + "/" + this.day + "/" + this.year;
    }
}
