package ex07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students {
    private List<Student> students;

    public void setStudents(List<Student> students) {
        this.students = new ArrayList<>(students);
    }

    public Students(List<Student> data) {
        setStudents(data);
    }

    public void sortByScore(boolean ascending) {
        if (ascending) {
            Collections.sort(students);
        }
        else {
            Collections.sort(students, Collections.reverseOrder());
        }
    }

    public String getHighScore() {
        return String.format("%s",Collections.max(students).toString());
    }

    public String getLowScore() {
        return String.format("%s",Collections.min(students).toString());
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
