import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        String toModify = name.replaceAll("\\s+","");

        Random rand = new Random();
        ArrayList<Integer> indexes = new ArrayList<Integer>();

        Boolean newIndex;
        int index;

        for (int i = 0; i < toModify.length(); i++) {
            newIndex = false;
            do{
                index = rand.nextInt(toModify.length());
                if(!indexes.contains(index)){
                    newIndex = true;
                    indexes.add(index);
                }
            }while(!newIndex);
        }

        String newName = "";
        for (int i = 0; i < indexes.size(); i++) {
            newName += toModify.charAt(indexes.get(i));
        }
        System.out.println("Hi " + name + ", your scrambled name is " + newName);
    }
}
