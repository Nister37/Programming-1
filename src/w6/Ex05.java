import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_TEMPERATURES = 7;
        double[] day = new double[NUMBER_OF_TEMPERATURES];
        double average = 0;

        System.out.println("Please enter 7 temperatures: ");
        for(int i=0; i<=NUMBER_OF_TEMPERATURES; i++){
            System.out.printf("Day %d: ", i+1);
            day[i] = scanner.nextDouble();
        }

        System.out.println("Summary:\n=================");
        for(int i=0; i<=NUMBER_OF_TEMPERATURES; i++){
            System.out.printf("Day %d        %.1f\n",i+1,day[i]);
            average += day[i];
        }
        System.out.println("=================");
        average /= day.length;
        System.out.printf("Average: %.2f", average);
    }
}
