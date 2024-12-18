import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        final byte MIN = 1;
        final byte MAX = 20;
        Scanner keyboard = new Scanner(System.in);
        int number = 0;
        boolean isNum;

        do{
            System.out.print("Enter a number: ");
            isNum = keyboard.hasNextInt();
            if(isNum){
                number = keyboard.nextInt();
                if(number < MIN || number > MAX){
                    System.out.println("Invalid number! Please input a number between " + MIN + " and " + MAX);
                }
            }else{
                System.out.println("Please input a number!");
                keyboard.nextLine();
            }
        }while(!isNum || (number < MIN || number > MAX));

        StringBuilder count = new StringBuilder();
        for (int i = 0; i < number; i++) {
            count.append(i+1).append(" ");
        }
        System.out.println(count);

        byte curIndex = 0;
        while(curIndex < count.length()){
            if(count.charAt(curIndex) == ' '){
                count.deleteCharAt(curIndex);
            }
            curIndex++;
        }
        System.out.println(count);
    }
}