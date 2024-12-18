import Ex08.ex08perfectnumber.PerfectNumber;

public class Ex08 {
    public static void main(String[] args) {
        PerfectNumber perfectNumber;
        for (int i = 2; i < 10000; i++) {
            perfectNumber = new PerfectNumber();
            String result = perfectNumber.getPerfect(i);
            if(result != null){
                System.out.println(result);
            }
        }
    }  // main()
}
