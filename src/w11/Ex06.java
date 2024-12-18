import ex06.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int computerMoveIndex;
        String playerMove = ""; // Initialize playerMove
        String computerMove;
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();

        while (true) {
            System.out.println("Enter the number in range from 1 to 4 (4 to leave): ");
            try {
                int range = sc.nextInt();

                if (range >= 1 && range <= 4) {
                    switch (range) {
                        case 1:
                            playerMove = moves[0];
                            break;
                        case 2:
                            playerMove = moves[1];
                            break;
                        case 3:
                            playerMove = moves[2];
                            break;
                        case 4:
                            System.out.println("Goodbye!");
                            return;
                    }
                    computerMoveIndex = rand.nextInt(0, 2 + 1);
                    computerMove = moves[computerMoveIndex];

                    System.out.println("Player move: " + playerMove);
                    System.out.println("Computer move: " + computerMove);

                    if (playerMove.equals(computerMove)) {
                        System.out.println("It's a draw!");
                    } else if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
                            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
                            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("Computer wins!");
                    }
                } else {
                    System.out.println("Please enter a number between 1 and 4!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid number.");
                sc.next(); // Clear invalid input
            }
        }
    }
}
