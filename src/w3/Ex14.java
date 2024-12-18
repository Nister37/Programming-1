import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an uneven number of width between 13 and 29: ");

        byte width = in.nextByte();
        final byte MIN_NUM = 13;
        if(width>29 || width<13){
            width = MIN_NUM;
        }
        if(width%2==0){
            width--;
        }
        for(byte i=1;i<=width;i+=2){
            int lineWidth = (width-i) /2;
            printFreeSpace(lineWidth);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(byte i=1;i<(width*0.25)-1;i++){
            int lineWidth = (width-3) / 2;
            printFreeSpace(lineWidth);
            for(int j=1;j<=3;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printFreeSpace(int width){
        for(int j=1;j<=width;j++){
            System.out.print(" ");
        }
    }
}