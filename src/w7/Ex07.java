import animals.*;

public class Ex07 {
    public static void main(String[] args) {
        Animal[] garden = {
                new Dog("Ramses", "Border Collie", "black", "5522"),
                new Rabbit("Floppy", "Angora", "gray", true)
        };
        String[] names = {"Leonardo", "Donatello"};
        for (int i = 0; i < garden.length; i++) {
            garden[i].setName(names[i]);
            System.out.println(garden[i]);
        }
    }
}