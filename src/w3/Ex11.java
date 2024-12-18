import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers would you want to print? ");
        int amount = sc.nextInt();
        System.out.print("What is the starting value? ");
        int start = sc.nextInt();
        System.out.print("What is the increment? ");
        int increment = sc.nextInt();

        for(int i = 1; i <= amount; i++){
            System.out.print(start + increment*i + " ");
        }
    }
}