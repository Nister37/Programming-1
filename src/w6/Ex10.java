import ex09.card.Card;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        String[] suits = {
                "clubs", "diamonds", "spades", "hearts"
        };
        String[] ranks = {
                "ace", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten",
                "jack", "queen", "king"
        };
        Card[] cards = new Card[52];

        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cards[i + (j * 13)] = new Card(ranks[i],suits[j]);
            }
        }
        System.out.print("How many cards would you like? (1..5) ");

        Scanner sc = new Scanner(System.in);
        try{
            int cardCount = sc.nextInt();
            if (cardCount<1) {
                throw new Exception("The number is lower than 1.");
            }else if(cardCount>5){
                throw new Exception("The number is higher than 5.");
            }else{
                Boolean[] cardIsTaken = new Boolean[52];
                Card[] selectedCards = new Card[cardCount];
                int takenCards = 0;
                Random rand = new Random();
                do{
                    int randNum = rand.nextInt(52);
                    if(cardIsTaken[randNum] == null){
                        cardIsTaken[randNum]=true;
                        selectedCards[takenCards] = cards[randNum];
                        takenCards++;
                        System.out.println(cards[randNum].getRank() + " of " + cards[randNum].getSuit());
                    }
                }while(takenCards<cardCount);

            }
        }catch (Exception e){
            System.out.println("That's not a valid amount!");
        }
    }
}
