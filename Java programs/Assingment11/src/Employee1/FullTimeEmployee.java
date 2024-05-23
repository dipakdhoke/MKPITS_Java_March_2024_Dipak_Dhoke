package Employee1;

public class FullTimeEmployee extends Employee {
   double workingHours;

   FullTimeEmployee(String name, double paymentPerHour,double workingHours) {
      super(name, paymentPerHour);
      this.workingHours=workingHours;
   }

   public double calculateSalary(){
      return paymentPerHour * workingHours * 40;
   }
}
