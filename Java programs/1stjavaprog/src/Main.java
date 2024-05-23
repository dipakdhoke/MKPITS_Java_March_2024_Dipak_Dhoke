import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        int num1 = 78;
//        float num2 = 45.4F;
//        double num3 = 344.3;
//        long num4 = 332L;
//        char ch = 'D';
//        boolean flag = true;
//        String str = "Dipak";
//        System.out.println("Hello world!");
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(num3);
//        System.out.println(ch);
//        System.out.println(str);
//        System.out.println(flag);

//          Scanner scanner= new Scanner(System.in);
//        System.out.println("enter the 1st numbers");
//          int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int sum =num1+num2;
//        System.out.println(sum);
//        num1=num1+num2;
//        num2=num1-num2;
//        num1=num1-num2;
//        System.out.println("num 1 is:"+num1);
//        System.out.println("num 2  is:"+num2);

//        int num = 5;
//
//        if(num % 2 == 0)
//
//            System.out.println(num + "is even.");
//
//        else
//
//            System.out.println(num + " is odd.");
// factorial
//        int num = 5, factorial = 1;
//
//        for(int i = 1; i <= num; ++i) {
//
//            factorial *= i;
//
//        }
//
//        System.out.println("Factorial of " + num + " is: " + factorial);
//
//    }
//        double first = 2.5, second = 4.5;
//
//        double product = first * second;
//
//        System.out.println("The product is: " + product);
//
////        leap year
//        int year = 2024;
//
//        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//
//            System.out.println(year + " is a leap year.");
//
//        } else {
//
//            System.out.println(year + " is not a leap year.");
//
//        }
//         triangle equilateral
//        System.out.println("enter the side sides of trisngle\n");
//        Scanner scan = new Scanner(System.in);
//        int s1 =scan.nextInt();
//        int s2 =scan.nextInt();
//        int s3=scan.nextInt();
//        System.out.println("s1:"+s1+"  s2:"+s2+"  s3:"+s3);
//        if(s1==s2&&s2==s3){
//            System.out.println("it is equilateral");
//        } else if (s1==s2&&s2!=s3||s1!=s2&&s2==s3) {
//
//            System.out.println("it is iscoceles");
//
//        }else{
//            System.out.println("Its Scalen");
//        }

        System.out.println("enter the number\n");
        Scanner scan = new Scanner(System.in);
        boolean perfectsquare=false;
        int n1 =scan.nextInt();
        for (int i=1;i*i<=n1;i++){
            if (i*i==n1){
                perfectsquare=true;
            }
        }
        if(perfectsquare==true) {
          System.out.println("its  perfect square");
        }
        else{
            System.out.println("its not perfect square");
        }
    }

}