package Ex03.ex03box;

public class Box {
    private String type;
    private double length;
    private double width;
    private double height;
    public Box(String type, double length, double width, double height) {
        this.type = type;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Box(String type, double length) {
        this.type = type;
        this.length = length;
        this.width = length;
        this.height = length;
    }
    public double surface(){
        return (this.length * this.width) * 2 + (this.width * this.height) * 4;
    }
    public double volume(){
        return (this.length * this.width * this.height);
    }
    public double tapeLength(){
        double case1, case2, case3, min;
        case1 = this.length * 2 + this.width * 2;
        case2 = this.width * 2 + this.height * 2;
        case3 = this.height * 2 + this.length * 2;
        min = Math.min(Math.min(case1, case2), case3);
        return min;
    }
    @Override
    public String toString() {
        return "Type: " + this.type + "\n" +
                "Length: " + this.length + "cm\n" +
                "Width: " + this.width + "cm\n" +
                "Height: " + this.height + "cm\n" +
                "Surface: " + this.surface() + "cm²\n" +
                "Volume: " + this.volume() + "cm³\n" +
                "Minimum tapelength: " + this.tapeLength() + "cm";
    }
}
