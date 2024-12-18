package Ex08.ex08perfectnumber;

import java.util.ArrayList;

public class PerfectNumber {
    public PerfectNumber() {}
    public String getPerfect(int number) {
        int perfect = 0;
        String divisors = "";
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfect += i;
                divisors += i + " ";
            }
        }
        if (perfect == number) {
            return String.format("%d --> " + divisors, number);
        } else {
            return null;
        }
    }

}
