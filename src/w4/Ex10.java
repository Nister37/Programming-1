import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        final int AMOUNT = 5;
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();

        // Read AMOUNT words and append each word to the StringBuilder.
        // Use a for-loop and 'printf'.
        for (int i = 0; i < AMOUNT; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            builder.append(scanner.nextLine() + " ");
        }

        // Print the content of 'builder'.
        System.out.println("Content of builder: " + builder);

        // Create a copy of the StringBuilder object and name it 'copy'. Make sure it contains
        // the same content as the original StringBuilder.
        StringBuilder builder1 = new StringBuilder(builder.toString());

        // Print the content of 'copy'.
        System.out.println("Content of copy: " + builder1);

        // Now check if 'builder' has the same content as 'copy'. Try '==' as well as the 'equals' method.
        // Note: unlike 'String', 'StringBuilder' doesn't actually have an implementation of the 'equals'
        // method. Yet, we can still call the 'equals' method on objects of type StringBuilder.
        // This will be explained later on! (You might want to take a look at the 'Object' class.)

        boolean comparsion1, comparsion2;
        comparsion1 = builder == builder1;
        comparsion2 = builder.equals(builder1);

        System.out.println("Comparison with == results in: " + comparsion1);
        System.out.println("Comparison with equals results in: " + comparsion2);

        // Convert builder to upper case without using the String class and without creating
        // a new StringBuilder.
        // Hint: use an ASCII table.

        for (int i = 0; i < builder.length(); i++) {
            char currentChar = builder.charAt(0);
            if(currentChar >= 97 && currentChar <= 122) {
                char newChar = (char) ((int) currentChar -32);
                builder.append(newChar);
            }else{
                builder.append(currentChar);
            }
            builder.deleteCharAt(0);
        }
        System.out.println("Upper case: " + builder);
    }
}