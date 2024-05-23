package FinalInheritanceHierarchy;

class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    // No displayInfo method in Student class
}
