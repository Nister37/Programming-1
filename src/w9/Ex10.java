import com.sun.source.tree.Tree;
import ex08.Girl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Ex10 {
    public static void main(String[] args) {
        Random rand = new Random();
        TreeSet<Integer> numbers = new TreeSet<>();
        int setLength = 0;
        do{
            int randNum = rand.nextInt(1,45+1);
            numbers.add(randNum);
        }while(numbers.size() < 6);

        System.out.println(numbers);
    }
}
