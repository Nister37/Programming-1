import java.util.*;

public class Ex02andEx05 {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numberList.add(rand.nextInt(1,50+1));
        }
        System.out.println(numberList);

        int[] numberArray  = new int[numberList.size()];
        for (int i = 0; i < numberList.size(); i++) {
            numberArray[i] = numberList.get(i);
        }

        for(int number : numberArray) {
            System.out.println(number);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        for(int number : numberArray) {
            if(number % 2 != 0) {
                evenNumbers.add(number);
            }
        }


        Collections.sort(evenNumbers);
        System.out.println(evenNumbers);
        Collections.reverse(evenNumbers);
        System.out.println(evenNumbers);
        Collections.shuffle(evenNumbers);
        System.out.println(evenNumbers);
        System.out.println(Collections.frequency(evenNumbers, 48));
    }
}
