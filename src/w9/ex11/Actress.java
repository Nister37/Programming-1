package ex11;

public class Actress implements Comparable<Actress>{
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return name.equals(((Actress) obj).name);
    }

    @Override
    public int hashCode() { return name.hashCode(); }

    public int compareTo(Actress other) {
        int compareYear = getBirthYear() - other.getBirthYear();
        return compareYear != 0 ? compareYear : getName().compareTo(other.getName());
    }
}
