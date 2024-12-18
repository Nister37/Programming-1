import ex11.*;
import java.util.List;

public class Ex11 {
    private static final List<Actress> testdata = List.of(
            new Actress("Cameron Diaz", 1972),
            new Actress("Nathalie Meskens", 1982),
            new Actress("Angelina Jolie", 1975),
            new Actress("Jennifer Lopez", 1970),
            new Actress("Reese Witherspoon", 1976),
            new Actress("Zoe Kravitz", 1988),
            new Actress("Jennifer Lawrence", 1990),
            new Actress("Kirsten Dunst", 1982),
            new Actress("Kate Winslet", 1975),
            new Actress("Emma Watson", 1990),
            new Actress("Marie Vinck", 1983),
            new Actress("Anne Hathaway", 1982),
            new Actress("Drew Barrymore", 1975),
            new Actress("Natalie Portman", 1981),
            new Actress("Tara Reid", 1975),
            new Actress("Katie Holmes", 1978),
            new Actress("Anna Faris", 1976)
    );

    public static void main(String[] args) {
        Actress reese = new Actress("Reese Witherspoon", 1976);
        Actress drew = new Actress("Drew Barrymore", 1975);
        Actress anna = new Actress("Anna Faris", 1976);
        Actress nathalie= new Actress("Nathalie Meskens", 1982);
        // TODO 1: Print out the size of the test Data


        // TODO 2: Use a List to add nathalie and anna to the test data. Print out the size of the list.
        // Print out the list with a for-each statement


        // TODO 3: next remove reese and drew from the list and print the list size and the list with one statement


        // TODO 4: now remove all actresses born before 1976 and print again


        // TODO 5: use an appropriate collection to remove all duplicates from the resulting list
        // and sort in natural order. Print out the collection
    }
}
