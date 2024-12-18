import ex00.DayOfWeek;

public class Ex00 {
    public static void main(String[] args) {
        int dayNum = 1;
        for(DayOfWeek day : DayOfWeek.values()){
            System.out.println("Day " + dayNum++ + ": " + day);
        }
    }
}
