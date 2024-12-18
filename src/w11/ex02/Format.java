package ex02;

public enum Format {
    VHS,
    DVD,
    BLU_RAY;

    @Override
    public String toString() {
        return String.format("%s", name().toUpperCase());
    }
}
