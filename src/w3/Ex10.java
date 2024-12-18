import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("We'll draw an ASCII box using a character and dimensions of your choice.");
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int width, height;
        do {
            System.out.print("Enter the width (2..60)");
            width = sc.nextInt();
            if(width < 2 || width > 60){
                System.out.println("Invalid width.");
            }
        }while(width<2 || width>60);

        do{
            System.out.print("Enter the height (2..20)");
            height = sc.nextInt();
            if(height < 2 || height > 20){
                System.out.println("Invalid height.");
            }
        }while(height < 2 || height > 20);

        //part1
        for(int i=1; i<=height; i++){
            for(int j=1; j<=width; j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();

        //part2
        for(int i=1; i<=height; i++){
            System.out.print(ch);
            if(i==1 || i==height){
                for(int j=1; j<width; j++){
                    System.out.print(ch);
                }
                System.out.println();
            }else {
                for (int j = 1; j < width - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println(ch);
            }
        }
    }
}