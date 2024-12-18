package animals;

public class Rabbit extends Animal {
    private final String TAG_LINE="Carrots are good for your eyes";
    private boolean digs;

    public Rabbit(String name, String breed, String colour, boolean digs) {
        super(name,breed,colour);
        this.digs = digs;
    }

    public String getTagLine() {
        return TAG_LINE;
    }

    @Override
    public String toString() {
        return getName() + " is a " + getColour() + " " + getBreed() + " Rabbit (" + getTagLine() + ")";
    }
}
