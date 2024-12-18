import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        System.out.println("We'll print all numbers below 1000 that are divisible between 2 numbers of your choosing.");
        Scanner sc = new Scanner(System.in);
        //task 1
        while(true) {
            System.out.print("Enter the first divider (end the program with 0): ");
            int firstDivider = sc.nextInt();
            if (firstDivider == 0) {
                System.exit(0);
            }

            System.out.print("Enter the second divider: ");
            int secondDivider = sc.nextInt();

            int numsInLine = 0;
            if(firstDivider>0 && secondDivider>0) {
                for (int i = 1; i <= 1000; i++) {
                    if (i % firstDivider == 0 && i % secondDivider == 0) {
                        System.out.print(i + " ");
                        numsInLine++;
                        if (numsInLine > 10) {
                            System.out.println();
                            numsInLine = 0;
                        }
                    }
                }
                System.out.println();
            }else{
                System.out.println("Please enter a positive number");
            }
        }
    }
}