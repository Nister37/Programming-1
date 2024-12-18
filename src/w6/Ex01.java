public class Ex01 {
    public static void main(String[] args){
        int[] numbers = new int[5];
        float[] stockMarketRates = new float[20];
        boolean[] switches = new boolean[8];
        String[] words = new String[4];

        System.out.println(numbers[0] + "\n" + stockMarketRates[0] + "\n" + switches[0] + "\n" + words[0]);
        System.out.print(numbers[numbers.length-1]
                + "\n" + stockMarketRates[stockMarketRates.length-1]
                + "\n" + switches[switches.length-1]
                + "\n" + words[words.length-1]);
    }
}
