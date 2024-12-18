package ex04;

public class Data {
    private final static int MAX = 15;
    private final int[] numbers = new int[MAX];

    public Data() {
        for (int i = 0; i < MAX; i++) {
            numbers[i] = (i + 10);
        }
    }

    public class Iterator {
        private int next=0;

        public boolean hasNext() {
            return next<MAX;
        }
        public int next() {
            return numbers[next++];
        }
    }
}
