package Ex07.ex07circle;

public class Circle {
    private int radius;
    private String color="Black";

    public Circle(int radius, String color) {
        if(radius >= 10 && radius <= 1000){
            this.radius = radius;
        }
        this.color = color;
    }
    public Circle(int radius) {
        if(radius >= 10 && radius <= 1000){
            this.radius = radius;
        }else{
            System.out.println("Radius must be between 10 and 1000!");
        }
    }
    public int getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }
    public void setRadius(int radius) {
        if(radius >= 10 && radius <= 1000){
            this.radius = radius;
        }else{
            System.out.println("Radius must be between 10 and 1000!");
        }
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double circumference() {
        return 2 * Math.PI * radius;
    }
    public double surface(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double deltaCircumference(Circle other) {
        return Math.abs(other.circumference() - this.circumference());
    }
    public double deltaSurface(Circle other) {
        return Math.abs(other.circumference() - this.surface());
    }
    @Override
    public String toString() {
        return String.format("Color: %s, Radius: %d, Circumference: %.2f, Surface: %.2f", color, radius, circumference(), surface());
    }
}
