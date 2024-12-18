package animals;

public class Animal {
    private String name;
    private String breed;
    private String colour;

    public Animal(String name, String breed, String colour) {
        setName(name);
        setBreed(breed);
        setColour(colour);
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
