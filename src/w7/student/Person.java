package student;

public class Person {
    private String name;
    private Phone phone;
    public Person(String name, String number) {
        setName(name);
        setPhone(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(String number) {
        this.phone = new Phone(number);
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", phone=" + phone + "]";
    }
}
