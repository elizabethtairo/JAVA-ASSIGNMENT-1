package aid;

public class Time {
    private int second=0;
    private int minute=0;
    private int hour=0;

    public Time(){

    }

    public Time(int sec, int min, int hr){

        second=sec;
        minute=min;
        hour=hr;
    }

    public int getSecond() {

        return second;
    }

    public void setSecond(int second) {

        this.second = second;
    }

    public int getMinute() {

        return minute;
    }

    public void setMinute(int minute) {

        this.minute = minute;
    }

    public int getHour() {

        return hour;
    }

    public void setHour(int hour) {

        this.hour = hour;
    }

    @Override
    public String toString() {

        return "(" +Integer.toString(this.hour) +":" +Integer.toString(this.minute) +":" +Integer.toString(this.second)+")";
    }

    public void setTime(int second, int minute, int hour){
        this.second=second;
        this.minute=minute;
        this.hour=hour;
    }

    public int nextsecond(){

        return  second+1;
    }
}

