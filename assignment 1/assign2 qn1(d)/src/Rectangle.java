public class Rectangle extends Shape {
    private Double width = 1.0;
    private Double length = 1.0;

    public Rectangle(){

    }

    public Rectangle(Double width, Double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(Double width, Double length, String color, Boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getArea(){
        return length * width;
    }

    public Double getperimeter(){
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return toString();
    }
}
