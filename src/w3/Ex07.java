import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        int asciiValue = 48;
        while(asciiValue != 71) {
            if(asciiValue == 58) {
                asciiValue = 65;
            }
            System.out.print((char) asciiValue + " ");
            asciiValue++;
        }
    }
}