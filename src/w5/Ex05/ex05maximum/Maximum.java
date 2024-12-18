package Ex05.ex05maximum;

public class Maximum {
    private int one;
    private int two;
    private int three;

    public Maximum() {
        System.out.println("Constructor without parameters called.");
    }
    public Maximum(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
        System.out.println("Int constructor called.");
    }
    public Maximum(long one, long two, long three) {
        this.one = (int) one;
        this.two = (int) two;
        this.three = (int) three;
        System.out.println("Long constructor called.");
    }
    public Maximum(double one, double two, double three) {
        this.one = (int) one;
        this.two = (int) two;
        this.three = (int) three;
        System.out.println("Double constructor called.");
    }
    public double max() {
        return Math.max(this.one, Math.max(this.two, this.three));
    }
    public int max(int one, int two, int three) {
        System.out.println("int parameters method called");
        return Math.max(one, Math.max(two, three));
    }
    public long max(long one, long two, long three) {
        System.out.println("long parameters method called");
        return Math.max(one, Math.max(two, three));
    }
    public double max(double one, double two, double three) {
        System.out.println("double parameters method called");
        return Math.max(one, Math.max(two, three));
    }
}
