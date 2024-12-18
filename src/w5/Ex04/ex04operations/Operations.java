package Ex04.ex04operations;

public class Operations {
    private double numberOne;
    private double numberTwo;

    public Operations(double numberOne, double numberTwo) {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public double sum() {
        return this.numberOne + this.numberTwo;
    }
    public double difference(){
        return this.numberOne - this.numberTwo;
    }
    public double product(){
        return this.numberOne * this.numberTwo;
    }
    public double quotient(){
        return this.numberOne / this.numberTwo;
    }
}
