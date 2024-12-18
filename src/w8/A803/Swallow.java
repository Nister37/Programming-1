package A803;

public class Swallow implements EggLaying,Flying,Named{
    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;

    public Swallow(String name, int numberOfEggsPerYear, int maxSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
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
    public int getMaxFlyingSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nEggs: %d\nSpeed: %d", getName(),getNumberOfEggsPerYear(),getMaxFlyingSpeed());
    }
}
