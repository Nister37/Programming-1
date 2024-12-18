import java.util.prefs.PreferenceChangeListener;

public class ex02 {
    public static void main(String[] args) {
        //part1
        long num1 = 2_000_000_000;
        long num2 = 2_000_000_000;
        System.out.println(num1 + num2);
        //part2
        num1 = 10_000;
        num2 = 10_000;
        int result = (int)(num1 + num2);
        //part3
        int first = 8;
        int second = 5;
        System.out.println(first + second);
        System.out.println(second - first);
        System.out.println(first * second);
        System.out.println(first / second);
        System.out.println(first % second);
        //part4
        result = ++first;
        System.out.println(result);
        result = first++;
        System.out.println(result);
        result = --second;
        System.out.println(result);
        result = second--;
        System.out.println(result);
    }
}