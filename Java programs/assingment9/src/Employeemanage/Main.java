package Employeemanage;


public class Main {
    public static void main(String[] args) {
        Employee hourlyEmployee = new HourlyEmployee("John", "123", 15.5, 40);
        System.out.println("Hourly Employee Information:");
        hourlyEmployee.displayInfo();

        System.out.println();

        Employee salariedEmployee = new SalariedEmployee("Alice", "456", 50000);
        System.out.println("Salaried Employee Information:");
        salariedEmployee.displayInfo();
    }
}