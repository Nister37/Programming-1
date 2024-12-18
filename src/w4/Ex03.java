import java.util.Random;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.replace("a","o"));
        System.out.println(sentence.length());
        System.out.println(sentence.charAt(0));
        System.out.println(sentence.charAt(sentence.length()-1));
        int count = 0;
        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.charAt(i) == 'e') {
                count++;
            }
        }
        System.out.println(count);
    }
}