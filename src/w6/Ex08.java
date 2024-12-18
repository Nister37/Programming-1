public class Ex08 {
    public static void main(String[] args) {
        String text = "Java can be tricky at times";
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.print("\"" + word + "\" ");
        }
    }
}
