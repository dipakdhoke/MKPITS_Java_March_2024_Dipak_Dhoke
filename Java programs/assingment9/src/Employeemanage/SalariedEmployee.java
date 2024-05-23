package Employeemanage;

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}