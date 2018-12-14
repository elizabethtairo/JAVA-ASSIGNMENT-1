package aid;
public class Point {
    private int x=0;
    private int y=0;

    public Point(){

    }

    public Point(int a, int b){
        x=a;
        y=b;
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {

        this.x = x;
    }

    public int getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    @Override
    public String toString() {

        return "(" +Integer.toString(this.x) +"," +Integer.toString(this.y) +")";
    }

    public int getXY(){
        int[] array = new int[2];
         array[0] = x;
         array[1]=y;
        return array[1];
    }

    public void  setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int distance(int x, int y){

        return x;
    }

    public double distance(double another){
        return another;
    }

    public double distance(){
        double m = 0;
        double n = 0;
        return n;
    }


}
