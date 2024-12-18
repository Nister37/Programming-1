public class Ex07 {
    public static void main(String[] args){
        StringBuilder[] suits = new StringBuilder[4];
        suits[0] = new StringBuilder("hearts");
        suits[1] = new StringBuilder("clubs");
        suits[2] = new StringBuilder("diamonds");
        suits[3] = new StringBuilder("spades");
        for(StringBuilder string : suits){
            System.out.println(string);
        }

        StringBuilder[] suits2 = {
            new StringBuilder("hearts"),
            new StringBuilder("clubs"),
            new StringBuilder("diamonds"),
            new StringBuilder("spades")
        };
        for(StringBuilder string : suits2){
            System.out.println(string);
        }
    }
}
