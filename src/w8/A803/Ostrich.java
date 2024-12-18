package A803;

public class Ostrich implements EggLaying,Named{
    private String name;
    private int numberOfEggsPerYear;
    public Ostrich(String name, int numberOfEggsPerYear) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getNumberOfEggsPerYear() {
        return numberOfEggsPerYear;
    }
    @Override
    public String toString() {
        return String.format("Name: " + getName() + "\nNumber of eggs per year: " + getNumberOfEggsPerYear());
    }
}
