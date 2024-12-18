import java.util.Scanner;

public class ex08 {
    public static void main(String[] args){
        final int MINIMUM = 1000;
        final int MAXIMUM = 9999;
        String number;

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a 4-digit whole number (1000..9999): ");
            number = input.nextLine();

            if(Integer.parseInt(number)<MINIMUM || Integer.parseInt(number)>MAXIMUM || Integer.parseInt(number)==-1){
                System.exit(0);
            }

            int sum = 0;
            for (int i = 0; i < number.length(); i++) {
                sum += Integer.parseInt(number.charAt(i) + "");
            }
            System.out.println("The sum of the digits of this number is " + sum);
        }
    }
}
