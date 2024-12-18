package A803;

public class Animals {
    private Named[] animals;
    private int amount;

    public Animals() {
        amount = 0;
        animals = new Named[100];
    }
    public void add(Named animal) {
        this.animals[amount++] = animal;
    }

    public void print() {
        for(int i = 0; i < amount; i++) {
            System.out.println(animals[i]);
        }
    }
}
