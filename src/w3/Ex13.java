import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        //task 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Which multiplication table would you like to see? ");
        int digit = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + digit + " = " + i*digit);
        }

        //task 2&3
        System.out.print("Which multiplication table would you like to practice? ");
        int correct = 0;
        int wrong = 0;

        for(int i = 1; i <= 10; i++){
            System.out.print(i + " x " + digit + " = ");
            int input = sc.nextInt();
            if(input == i*digit){
                System.out.println("Correct!");
                correct++;
            }else{
                System.out.println("Wrong!");
                wrong++;
            }
        }
        System.out.println("Correct: " + correct + "\nWrong: " + wrong);
    }
}