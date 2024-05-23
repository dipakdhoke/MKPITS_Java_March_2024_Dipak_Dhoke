package Employee1;

public abstract class Employee {
    private String name;
    double paymentPerHour;
    Employee(String name, double paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    abstract double calculateSalary();


}
