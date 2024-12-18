package student;

public class Phone {
    private String number;
    public Phone(String number) {
        setNumber(number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    @Override
    public String toString() {
        return "Phone [number=" + number + "]";
    }
}
