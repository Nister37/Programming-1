public class Ex03 {
    public static void main(String[] args){
        int[] lotteryNumbers = new int[20];
        for(int i=0; i<lotteryNumbers.length; i++){
            lotteryNumbers[i] = 7*(i+1);
        }

        printNumbers(lotteryNumbers);
        printNumbersReverse(lotteryNumbers);
    }
    public static void printNumbers(int[] numbers){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    public static void printNumbersReverse(int[] numbers){
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
