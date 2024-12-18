import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        String whiteSpace;
        do {
            System.out.println("Enter a number between 1 and 30: ");
            input = sc.nextInt();
        }while(input<1 || input>30);

        for(int i=1; i<=input; i++){
            System.out.print("|");
            for(int j=1; j<=input; j++){
                if(i*j > 99){
                    whiteSpace = "";
                }else if(i*j > 9){
                    whiteSpace = " ";
                }else{
                    whiteSpace = "  ";
                }
                System.out.print(whiteSpace + i*j + "|");
            }
            System.out.println();
        }
    }
}