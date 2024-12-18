package ex07;

public class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        setName(name);
        setScore(score);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%s , %.2f", getName(), getScore());
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(getScore(), o.getScore());
    }
}
