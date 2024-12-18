import Ex06.ex06salesperson.SalesPerson;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name;
        double revenue;

        name="Jan";
        System.out.printf("Enter %s's revenue: ",name);
        SalesPerson one = new SalesPerson(name, scanner.nextDouble());

        name="Laetitia";
        System.out.printf("Enter %s's revenue: ",name);
        SalesPerson two = new SalesPerson(name, scanner.nextDouble());

        name="Lotte";
        System.out.printf("Enter %s's revenue: ",name);
        SalesPerson three = new SalesPerson(name, scanner.nextDouble());
        // TODO: Print out the name of the top earner!

        if(one.hasMoreRevenueThan(two))
        {
            if(one.hasMoreRevenueThan(three)){
                System.out.printf("One has the biggest earnings!");
            }else{
                System.out.printf("Three has the biggest earnings!");
            }
        }else{
            if(two.hasMoreRevenueThan(three)){
                System.out.printf("Two has the biggest earnings!");
            }
            else{
                System.out.printf("Three has the biggest earnings!");
            }
        }
    }
}
