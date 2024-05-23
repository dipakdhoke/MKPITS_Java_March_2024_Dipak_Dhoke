package Employee1;

public class Main {
    public static void main(String[] args) {
    Contractor contrsctor =new Contractor("sam",4000,24);
    FullTimeEmployee fullemployee =new FullTimeEmployee("tom",5000,30);
        System.out.println("salary of contrator is:"+contrsctor.calculateSalary()+" salary of fullemplyee"+fullemployee.calculateSalary());
    }

}
