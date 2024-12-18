import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the VAT percentage: ");
        float vatPercentage = sc.nextInt();

        System.out.print("Enter an amount in €: ");
        float amount = sc.nextInt();
        float amountWithVAT = 0;

        System.out.print("Make a choice (1 = inclusive, 2 = exclusive): ");
        int choice = sc.nextInt();
        boolean dontPrint = false;

        switch (choice){
            case 1:
                amountWithVAT = amount * vatPercentage / 100;
            case 2:
                amountWithVAT = amount;
                amount = amount / (1 + vatPercentage / 100);
                break;
            default:
                dontPrint = true;
        }

        if (!dontPrint){
            System.out.println("€" + amount + " + " + vatPercentage + "% VAT = " + amountWithVAT);
        }
        else{
            System.out.print("Invalid choice!");
        }
    }
}
