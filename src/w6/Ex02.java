public class Ex02 {
    public static void main(String[] args){
        int[] lotteryNumbers = {3, 6, 17, 31, 23, 43};

        printNumbers(lotteryNumbers);
        lotteryNumbers[1] = 13;
        printNumbers(lotteryNumbers);
    }
    public static void printNumbers(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
