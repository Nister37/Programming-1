package student;

public class Student extends Person{
    private int number;
    public Student(int number, String name, String phone) {
        super(name, phone);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
