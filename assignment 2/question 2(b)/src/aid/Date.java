package aid;

public class Date {
    private int year;
    private int month;
    private int day;
    public Date(int yr,int mnth,int dy)
    {
       year=yr;
       month=mnth;
       day=dy;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "(" +Integer.toString(this.day) +"/" +Integer.toString(this.month) +"/" +Integer.toString(this.year)+")";
    }



    public int setDate(int year,int month,int day)
    {
       return 0;
    }
}
