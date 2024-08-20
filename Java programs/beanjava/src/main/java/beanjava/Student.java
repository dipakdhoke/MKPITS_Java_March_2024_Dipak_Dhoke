package beanjava;

public class Student {
    private String name;
    private int marks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Default Constructor
    public Student() {}

    // Getters and Setters
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

    // Method to determine pass/fail
    public String result() {
        if (marks >= 50) {
            return "pass";
        } else {
            return "fail";
        }
    }
}
