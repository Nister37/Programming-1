package A803;

public class Eagle implements EggLaying,Flying,Named{
    private String name;
    private int numberOfEggsPerYear;
    private int maxSpeed;
    private int divingSpeed;

    public Eagle(String name, int numberOfEggsPerYear, int maxSpeed, int divingSpeed) {
        this.name = name;
        this.numberOfEggsPerYear = numberOfEggsPerYear;
        this.maxSpeed = maxSpeed;
        this.divingSpeed = divingSpeed;
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

    public int getDivingSpeed() {
        return divingSpeed;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nNumber of eggs per year: %d\nSpeed: %d\nDiving speed: %d",getName(),getNumberOfEggsPerYear(),getMaxFlyingSpeed(),getDivingSpeed());
    }
}
