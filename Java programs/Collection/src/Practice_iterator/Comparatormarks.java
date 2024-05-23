package Practice_iterator;

import java.util.Comparator;

public class Comparatormarks implements Comparator<Student> {
    public int compare(Student o3, Student o4) {
        return Integer.compare(o3.getMarks(),o4.getMarks());
    }
}
