import java.util.ArrayList;
import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true){
            System.out.print("Enter number: ");
            input = sc.nextLine();
            
            try{
                int checkIfNum = Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println("Not a number");
                System.exit(0);
            }

            if(input.equals("-1")){
                int result = 0;

                for(int i=numbers.size()-1;i>=0;i--){
                    int multiplier = (int) Math.pow(10,i);
                    result += multiplier * numbers.getFirst();
                    numbers.removeFirst();
                }
                System.out.println("The number is " + result);
                System.exit(0);
            }else {
                numbers.add(Integer.parseInt(input));
            }
        }
    }
}
