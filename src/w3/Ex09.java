import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting capital in €: ");
        double startingCapital = sc.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter the number of years: ");
        int numberOfYears = sc.nextInt();

        double result = (startingCapital * Math.pow(1 + (interestRate/100),numberOfYears));
        System.out.println("The capital will amount to €" + (int) result);

        //part2
        numberOfYears = 1;
        result = (startingCapital * Math.pow(1 + (interestRate/100),numberOfYears));
        while(result < startingCapital*2){
            numberOfYears++;
            result = (startingCapital * Math.pow(1 + (interestRate/100),numberOfYears));
        }
        System.out.print("It takes " + numberOfYears + " years to double the money.");
    }
}