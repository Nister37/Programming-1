import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int trueStatus = 0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the state of switch " + (i+1) + " (true or false): ");
            if(sc.nextLine().equals("true")){
                trueStatus += 1;
            }
        }
        if (trueStatus>=2) {
            System.out.println("At least two switches are turned on");
        }
        else {
            System.out.println("At most one switch is turned on");
        }
        if (trueStatus==2) {
            System.out.println("Exactly two switches are turned on");
        }

    }
}
