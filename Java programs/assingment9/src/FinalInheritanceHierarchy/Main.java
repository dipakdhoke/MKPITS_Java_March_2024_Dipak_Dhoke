package FinalInheritanceHierarchy;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, 123);
        Teacher teacher = new Teacher("Alice", 35, "Math");

        System.out.println("Student Information:");
        student.displayInfo();

        System.out.println("\nTeacher Information:");
        teacher.displayInfo();
    }
}