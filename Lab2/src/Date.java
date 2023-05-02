//To be the date means to have day, month, year
//Date can be reported
//The 3 date items need to be class level as they make up what the date is
public class Date {
int month;
int day;
int year;

    //Sets the date
    public void setDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    //Reports date
    public void report() {
        System.out.println(month + "/" + day + "/" + year);
    }

    //main
    public void main(String[] args) {
        setDate(11, 15, 2005);
        report();
    }

}
