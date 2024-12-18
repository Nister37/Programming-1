public class Ex05 {
    public static void main(String[] args) {
        for(byte i=1; i<=20; i++){
            long factorial = 1;
            for(byte j=1; j<=i; j++){
                factorial *= j;
            }
            System.out.println(i + "! = " + factorial);
        }
    }
}