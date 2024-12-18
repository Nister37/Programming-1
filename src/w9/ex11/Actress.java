package ex11;

public class Actress {
    private String name;
    private int birthYear;

    public Actress(String name, int birthYear) {
        setName(name);
        setBirthYear(birthYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return String.format("%s (%d)", getName(), getBirthYear());
    }


}
