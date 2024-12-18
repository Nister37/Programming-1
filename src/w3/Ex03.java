public class Ex03 {
    public static void main(String[] args) {
        //task 1
        byte currentNumber = 120;
        while (currentNumber >= 100) {
            System.out.print(currentNumber-- + " ");
        }
        System.out.println();

        currentNumber = 3;
        byte multiplier = 1;
        while (currentNumber*multiplier < 50) {
            System.out.print(currentNumber*multiplier++ + " ");
        }
        System.out.println();

        currentNumber = 5;
        byte power = 0;
        while (Math.pow(currentNumber, power) < 10_000) {
            System.out.print((int) Math.pow(currentNumber,power++) + " ");
        }
        System.out.println();

        currentNumber = 97;
        while (currentNumber <= 122) {
            System.out.print((char) currentNumber++ + " ");
        }
        System.out.println();

        //task 2
        currentNumber = 120;
        do{
            System.out.print(currentNumber-- + " ");
        }while(currentNumber >= 100);
        System.out.println();

        currentNumber = 3;
        multiplier = 1;
        do{
            System.out.print(currentNumber*multiplier++ + " ");
        }while((currentNumber*multiplier < 50));
        System.out.println();

        currentNumber = 5;
        power = 0;
        do {
            System.out.print((int) Math.pow(currentNumber,power++) + " ");
        }while (Math.pow(currentNumber, power) < 10_000);
        System.out.println();

        currentNumber = 97;
        do {
            System.out.print((char) currentNumber++ + " ");
        }while (currentNumber <= 122);
        System.out.println();

        //part 3

        for(byte curNum=120; curNum >= 100; curNum--){
            System.out.print(curNum + " ");
        }
        System.out.println();

        for(byte curNum=3; curNum < 50; curNum+=3){
            System.out.print(curNum + " ");
        }
        System.out.println();

        for(byte curMult=0; curMult < 6; curMult++){
            System.out.print((int) Math.pow(5,curMult) + " ");
        }
        System.out.println();

        for(byte curPow=97; curPow <= 122; curPow++){
            System.out.print((char) curPow + " ");
        }
    }
}