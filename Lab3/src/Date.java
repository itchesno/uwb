public class Date
{
    //main
    public static void main(String[] args){
        Date d = new Date();
        d.setDate(10, 21, 2018);
        d.report();
    }
    //instance variables
    private int month;
    private int day;
    private int year;

    //constructors
    public Date() {
        month = 6;
        day = 15;
        year = 2004;
    }

    //setters should be used to avoid privacy leak
    public Date(int m, int d, int y){
        setMonth(m);
        setDay(d);
        setYear(y);
    }

    public Date(Date other){
        setMonth(other.getMonth());
        setDay(other.getDay());
        setYear(other.getYear());
    }

    //setters
    public void setDate(int m, int d, int y){//what should you check?
        this.month = m;
        this.day = d;
        this.year = y;
    }

    public void setMonth(int m){
        this.month = m;
    }

    public void setDay(int d){
        this.day = d;
    }
    public void setYear(int y){
        this.year = y;
    }

    //getters
    public int getMonth(){
        int m = month;
        return m;
    }

    public int getDay(){
        int d = day;
        return d;
    }

    public int getYear(){
        int y = year;
        return y;
    }

    //compares if two dates are equal
    public boolean equals(Date other){
        if(month == other.getMonth() && day == other.getDay() && year == other.getYear()){
            return true;
        }
        return false;
    }

    //returns date in string form
    public String toString(){
        return "The date is: " + month + "." + day + "." + year;
    }

    //prints out date
    public void report(){
        System.out.printf("%d/%d/%d",month, day, year);
    }
}
