import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        final short MIN_ASCII = 32;
        final short MAX_ASCII = 127;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value between 32 and 127: ");
        short value = input.nextShort();

        if(value < MIN_ASCII || value > MAX_ASCII){
            System.out.println("Invalid value");
            System.exit(0);
        }

        System.out.println("ASCII char for " + value + " is " + (char)value);

        int column = 0;
        for(int i=MIN_ASCII; i<=255; i++){
            System.out.print((char)i + " ");
            if(column == 5) {
                System.out.println("");
                column = 0;
            }else{
                column++;
            }
        }
    }
}
