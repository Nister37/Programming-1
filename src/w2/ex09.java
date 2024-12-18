import java.util.Locale;
import java.util.Scanner;

public class ex09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Enter the previous mileage: ");
        int lastMileage = sc.nextInt();

        System.out.print("Enter the current mileage: ");
        int currentMileage = sc.nextInt();

        System.out.print("Enter the amount of liters refilled: ");
        double litersRefilled = sc.nextDouble();

        double consumption = litersRefilled/(currentMileage - lastMileage);
        consumption = consumption*100;
        System.out.printf("Consumption for %d km driven is %.2f liters/100 km\n", (currentMileage - lastMileage), consumption);

    }
}
