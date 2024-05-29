package studentmanage;


import java.util.*;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudentById(int id) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                break;
            }
        }
    }

    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void displayStudentsSortedByGrade() {
        List<Student> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents, Comparator.comparingInt(Student::getGrade));
        for (Student student : sortedStudents) {
            System.out.println(student);
        }
    }
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
         system.addStudent(new Student(1, "Alice", 85));
        system.addStudent(new Student(2, "Bob", 90));
        system.addStudent(new Student(3, "Charlie", 75));

        // Display all students
        System.out.println("All students:");
        system.displayAllStudents();
        System.out.println();

        // Search for a student by id
        System.out.println("Search for student with id 2:");
        Student foundStudent = system.findStudentById(2);
        if (foundStudent != null) {
            System.out.println(foundStudent);
        } else {
            System.out.println("Student not found");
        }
        System.out.println();

        // Display students sorted by grade
        System.out.println("Students sorted by grade:");
        system.displayStudentsSortedByGrade();
    }
}
