package ex02;

public class Movie {
    private String title;
    private int year;
    private Format format;
    private Audio audio;

    public Movie(String title, int year, Format format, Audio audio) {
        setTitle(title);
        setYear(year);
        setFormat(format);
        setAudio(audio);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    @Override
    public String toString() {
        return String.format("%-20s %-10d %-10s %-10s%n", getTitle(), getYear(), getFormat(), getAudio());
    }
}
