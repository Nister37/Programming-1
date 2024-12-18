import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        byte userAge = sc.nextByte();
        String ageCategory;
        if (userAge < 2) {
            ageCategory = "a baby";
        } else if (userAge <= 12 ) {
            ageCategory = "a child";
        } else if (userAge <= 17) {
            ageCategory = "a teenager";
        } else {
            ageCategory = "an adult";
        }
        System.out.println("You're " + ageCategory);
    }
}