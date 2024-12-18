package ex03;

import java.util.Random;

public class PlayingCard {
    public enum Rank{
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(10),
        QUEEN(10),
        KING(10),
        ACE(1);

        private int value;

        Rank(int value){
            setValue(value);
        }

        public int getValue(){
            return value;
        }
        public void setValue(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return String.format("%s", name().toLowerCase());
        }
    }

    public enum Suit{
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS;

        @Override
        public String toString(){
            return String.format("%s", name().toLowerCase());
        }
    }

    private static final Random RANDOM = new Random();
    private Rank rank;
    private Suit suit;

    public PlayingCard(Rank rank, Suit suit){
        setRank(rank);
        setSuit(suit);
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getValue() {
        return rank.getValue();
    }

    public static PlayingCard generateRandomPlayingCard(){
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        Rank rank = ranks[RANDOM.nextInt(ranks.length)];
        Suit suit = suits[RANDOM.nextInt(suits.length)];
        return new PlayingCard(rank,suit);
    }

    @Override
    public String toString(){
        return String.format("%s of %s", rank, suit);
    }
}
