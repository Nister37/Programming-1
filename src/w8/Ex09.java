import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        final String[] options = {"rock", "paper", "scissors"};
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int inputValue=0;
        do{
            try{
                System.out.println("Rock(1), paper(2), or scissors(3)? (enter 0 to stop) ");
                inputValue = sc.nextInt();
                if(inputValue >0 && inputValue <=3) {
                    System.out.println("Your choice: " + options[inputValue-1]);
                    int computerChoose = rand.nextInt(0,2+1);
                    System.out.println("My choice: " + options[computerChoose]);

                    if(inputValue-1==computerChoose){
                        System.out.println("It's a tie!");
                    }else{ //TODO improve it
                        if(inputValue-1==0){
                            if(computerChoose==1){
                                System.out.println("You lost!");
                            }else{
                                System.out.println("You won!");
                            }
                        }
                        if(inputValue-1==1){
                            if(computerChoose==2){
                                System.out.println("You lost!");
                            }else{
                                System.out.println("You won!");
                            }
                        }
                        if(inputValue-1==2){
                            if(computerChoose==3){
                                System.out.println("You lost!");
                            }else{
                                System.out.println("You won!");
                            }
                        }
                    }
                }else if(inputValue !=0){
                    throw new InputMismatchException("");
                }
            }catch (InputMismatchException e){
                System.out.println("Enter 0, 1, 2 or 3: ");
            }
        }while(inputValue!=0);
    }
}