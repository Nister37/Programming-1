import java.util.Scanner;

import Ex04.ex04operations.Operations;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the 2nd number : ");
        double num2 = sc.nextDouble();
        Operations operations = new Operations(num1,num2);
        System.out.println(operations.sum());
        System.out.println(operations.difference());
        System.out.println(operations.product());
        System.out.println(operations.quotient());
    }
}
