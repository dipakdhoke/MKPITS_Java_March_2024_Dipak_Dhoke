package Practice_iterator;

import java.util.Comparator;

public class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


//
//    public int compareTo(Student o) {
////        return name.compareTo(o.name);
////    }
////        OR
//        if (name.compareTo(o.name) == 0)
//            return 0;
//        else if (name.compareTo(o.name) > 0)
//            return 1;
//        else
//            return -1;
//
//
//    }

//
//         public int compareTo(Student j ) {
//             return new Integer(this.marks).compareTo(j.getMarks());
//
//         }

//
//         if (marks==((Student)o).marks);

}

