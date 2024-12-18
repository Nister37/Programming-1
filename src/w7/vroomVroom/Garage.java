package vroomVroom;

public class Garage {
    private String name;

    public Garage(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "name='" + name + '\'' +
                '}';
    }
}
