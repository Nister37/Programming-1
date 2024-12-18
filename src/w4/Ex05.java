public class Ex05 {
    public static boolean checkIfIsEqual(String str1, String str2) {
        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public static String makeTheDecision(boolean bool){
        if(bool) {
            return " are";
        }else{
            return " are not";
        }
    }

    public static void main(String[] args) {
        String stringOne = "java";
        String stringTwo = "Jakarta";
        String stringThree = "JAVA";
        String[] strings = new String[]{stringOne, stringTwo, stringThree};

        boolean[] comparsions = new boolean[strings.length];
        String decision;

        for (int i = 0; i < comparsions.length; i++) {
            if (i+1 < comparsions.length) {
                comparsions[i] = checkIfIsEqual(strings[i],strings[i + 1]);
                decision = makeTheDecision(comparsions[i]);
                System.out.println(strings[i] + " and " + strings[i+1] + decision + " equal");
            }else{
                comparsions[i] = checkIfIsEqual(strings[i],strings[0]);
                decision = makeTheDecision(comparsions[i]);
                System.out.println(strings[i] + " and " + strings[0] + decision + " equal");
            }
        }
    }
}