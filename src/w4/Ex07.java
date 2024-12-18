import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name and last name, separated by a space:");
        String name = sc.nextLine();

        StringBuilder builderOne = new StringBuilder(name);
        System.out.print(builderOne.charAt(0));
        byte index = 1;
        while(builderOne.charAt(index) != ' '){
            index++;
        }
        System.out.println(builderOne.charAt(++index));

        for(int i=builderOne.length()-1; i>=0; i--){
            System.out.print(builderOne.charAt(i));
        }
        System.out.println();

        for (int i = 0; i < builderOne.length(); i++) {
            if(builderOne.charAt(i) == 'e'){
                System.out.print('a');
            }else{
                System.out.print(builderOne.charAt(i));
            }
        }
        System.out.println();

        Random random = new Random();
        StringBuilder newString = new StringBuilder();
        int strLen = builderOne.length();

        for (int i = 0; i < strLen; i++) {
            int randomIndex = random.nextInt(builderOne.length());
            newString.append(builderOne.charAt(randomIndex));
            builderOne.deleteCharAt(randomIndex);
        }
        System.out.println(newString);
    }
}