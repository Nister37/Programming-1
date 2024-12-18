package studentExpanded;

public class Student extends Person {
    private int number;
    public Student(int number, String name, String email, String mobile, String fixed) {
        super(name, email, mobile, fixed);
        setNumber(number);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("studentNumber: %d\nname: %s\nemail: %s\nmobile %s\nfixed: %s",getNumber(),getName(),getContact().getEmail(),getContact().getMobile(),getContact().getFixed());
    }
}
