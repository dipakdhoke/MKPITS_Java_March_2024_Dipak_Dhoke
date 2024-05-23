package Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp_fulltime=new Employee() {
            @Override
            public void calculatesalary(double payperhour, double totaltime) {
                System.out.println(payperhour*totaltime);
            }

            @Override
            public void displaydetails(String name,String id) {
                System.out.println("name is"+name+"id is:"+id);

            }
        };

        Employee emp_parttime =new Employee() {
            @Override
            public void calculatesalary(double payperhour, double totaltime) {
                System.out.println(payperhour*totaltime);
            }

            @Override
            public void displaydetails(String name, String id) {
                System.out.println("name is"+name+"id is:"+id);
            }
        } ;
        Employee emp_contactbased= new Employee() {
            @Override
            public void calculatesalary(double payperhour, double totaltime) {
                System.out.println(payperhour*totaltime);
            }

            @Override
            public void displaydetails(String name, String id) {
                System.out.println("name is"+name+"id is:"+id);
            }
        };
    emp_fulltime.calculatesalary(344,12);
    }
}
