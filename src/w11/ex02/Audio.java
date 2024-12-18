package ex02;

public enum Audio {
    PCM,
    DOLBY,
    DOLBY_HD,
    VHS,
    DTS_HD;

    @Override
    public String toString() {
        return String.format("%s", name().toUpperCase());
    }
}
