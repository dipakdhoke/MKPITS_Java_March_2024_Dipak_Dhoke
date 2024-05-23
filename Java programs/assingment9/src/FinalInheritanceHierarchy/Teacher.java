package FinalInheritanceHierarchy;

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // No displayInfo method in Teacher class
}