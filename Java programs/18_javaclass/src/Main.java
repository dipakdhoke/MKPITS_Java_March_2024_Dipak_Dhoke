public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        getset getset1= new getset();
//        getset1.setName("dipak");
//        getset1.setMarks(99);
//        String s=getset1.getName();
//        int a =getset1.getMarks();
//        System.out.println(getset1.getName());
//        System.out.println(getset1.getMarks());
//        System.out.println(s+a);
          employee emp =new employee();
          emp.setName("Dipak");
          emp.setDepartment("IT");
          emp.setId("889");
          emp.setPhoneno(889900989);
        System.out.println(emp.getName());
        System.out.println(emp.getId());
        System.out.println(emp.getDepartment());
        System.out.println(emp.getPhoneno());
    }
}