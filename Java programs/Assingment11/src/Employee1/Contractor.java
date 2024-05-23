package Employee1;

public class Contractor extends Employee {
    double workingHours;

    Contractor(String name, double paymentPerHour,double workingHours) {
        super(name, paymentPerHour);
        this.workingHours=workingHours;
    }

    public double calculateSalary(){
        return paymentPerHour * workingHours;
    }

}
