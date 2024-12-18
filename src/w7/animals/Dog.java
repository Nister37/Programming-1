package animals;

public class Dog extends Animal {
    private String chipNumber;
    private String tagLine="Like a dog in a bowling game";

    public Dog(String name, String breed, String colour, String chipNumber) {
        super(name, breed, colour);
        this.chipNumber = chipNumber;
    }

    public String getChipNumber() {
        return chipNumber;
    }

    public String getTagLine() {
        return tagLine;
    }

    @Override
    public String toString() {
        return getName() + " is a " + getColour() + " " + getBreed() + " dog (" + getTagLine() + ")";
    }
}
