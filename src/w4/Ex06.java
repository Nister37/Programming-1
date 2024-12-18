public class Ex06 {
    public static void main(String[] args) {
        String str = "The more you learn, the less you know.";
        String substring = "ou";
        String textPart;
        int substrings = 0;
        for (int i = 0; i < str.length()-substring.length(); i++) {
            textPart = str.substring(i, i + substring.length());
            if (textPart.equals(substring)) {
                substrings++;
            }
        }
        System.out.println(str);
        System.out.println("Substring \"" + substring + "\" appears " + substrings + " time(s).");
    }
}