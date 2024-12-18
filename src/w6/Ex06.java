import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args){
        int[] letterAppearance = new int[26];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        int lettersAmount = 0;

        System.out.println("Your letter appearance is: " + letterAppearance[0]);
        for(char letter : sentence.toCharArray()){
            if((int) letter >= 97 && (int) letter <= 122) {
                letterAppearance[letter - 'a']++;
                lettersAmount++;
            }
        }
        int letterInLine = 0;
        for(int i = 97; i <=122; i++){
            System.out.print((char)i + " --> " + letterAppearance[i-97] + " times ");
            letterInLine++;
            if(letterInLine == 4){
                letterInLine = 0;
                System.out.print("\n");
            }
        }
        System.out.print("\nTotal amount of letters: " + lettersAmount);
    }
}
