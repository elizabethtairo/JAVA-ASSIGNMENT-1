public class Cylinder extends Circle  {
    private Double height = 1.0;

    public Cylinder(){

    }

    public Cylinder( Double radius){
        super(radius);
    }

    public Cylinder(Double radius,  Double height ){
        super(radius);
        this.height = height;
    }


    public Cylinder(Double radius,  Double height, String color){
        super(radius, color);
        this.height = height;

    }


    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getVolume(){
        return Math.PI * getArea() * height;
    }
}
