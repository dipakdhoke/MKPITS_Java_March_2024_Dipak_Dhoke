package Practice_iterator;

import java.util.Comparator;

public class Comparatorname implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
