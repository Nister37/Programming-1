import ex08.Girl;

import java.util.*;

public class Ex08AndEx09 {
    public static void main(String[] args) {
        ArrayList<Girl> girls = new ArrayList<>(List.of(new Girl("An", 20),new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Ekaterina", 18),
                new Girl("Bea", 20)));

        TreeSet<Girl> girlsSet = new TreeSet<>(girls);
        System.out.print(girlsSet);
        //part 2


    }
}
