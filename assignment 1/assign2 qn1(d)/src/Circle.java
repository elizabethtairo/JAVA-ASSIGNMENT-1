public class Circle extends Shape {
    private Double radius = 1.0;

    public Circle(){

    }

    public Circle(Double radius){
        this.radius = radius;
    }

    public Circle( Double radius, String color, Boolean filled){
        super(color, filled);
        this.radius = radius;

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea(){
        return Math.PI*radius*radius;
    }

    public Double getPerimeter(){
        return Math.PI * radius;
    }

    @Override
    public String toString() {
        return toString();
    }
}
