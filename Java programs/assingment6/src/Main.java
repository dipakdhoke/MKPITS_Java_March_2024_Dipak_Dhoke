import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // calculator
//             calculator cal=new calculator();
//        Scanner sc =new Scanner(System.in);
//     int choice;
//    int a ,b;
//        System.out.println("enter two numbers");
//        a= sc.nextByte();
//        b= sc.nextByte();
//        System.out.println("enter 1 for add" +
//                "2 substraction" +
//                "3 multiplicaton" +
//                "4 for division");
//        choice=sc.nextInt();
//     switch (choice){
//         case 1:
//             System.out.println(cal.addition(a,b));
//
//             break;
//         case 2:
//             System.out.println(cal.substraction(a,b));
//
//             break;
//
//         case 3:
//             System.out.println(cal.multiplication(a,b));
//             break;
//         case 4:
//             System.out.println(cal.division(a,b));
//         default:
//             System.out.println("enter valid input");
//     }
//  2 Tempreture

//        Scanner scanner = new Scanner(System.in);
//        TemperatureConverter converter = new TemperatureConverter();
//
//        System.out.println("Temperature Converter");
//        System.out.println("1. Celsius to Fahrenheit");
//        System.out.println("2. Fahrenheit to Celsius");
//        System.out.print("Enter your choice: ");
//        int choice = scanner.nextInt();
//
//        double temperature;
//        switch (choice) {
//            case 1:
//                System.out.print("Enter temperature in Celsius: ");
//                temperature = scanner.nextDouble();
//                double fahrenheit = converter.celsiusToFahrenheit(temperature);
//                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
//                break;
//            case 2:
//                System.out.print("Enter temperature in Fahrenheit: ");
//                temperature = scanner.nextDouble();
//                double celsius = converter.fahrenheitToCelsius(temperature);
//                System.out.println("Temperature in Celsius: " + celsius);
//                break;
//            default:
//                System.out.println("Invalid choice!");
//        }

//
//        5 Area calculator
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Area Calculator");
//            System.out.println("1. Square");
//            System.out.println("2. Rectangle");
//            System.out.println("3. Circle");
//            System.out.println("4. Triangle");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the side length of the square: ");
//                    double side = scanner.nextDouble();
//                    System.out.println("Area of the square: " + AreaCalculator.calculateCircleArea(side));
//                    break;
//                case 2:
//                    System.out.print("Enter the length of the rectangle: ");
//                    double length = scanner.nextDouble();
//                    System.out.print("Enter the width of the rectangle: ");
//                    double width = scanner.nextDouble();
//                    System.out.println("Area of the rectangle: " + AreaCalculator.calculateRectangleArea(length, width));
//                    break;
//                case 3:
//                    System.out.print("Enter the radius of the circle: ");
//                    double radius = scanner.nextDouble();
//                    System.out.println("Area of the circle: " + AreaCalculator.calculateCircleArea(radius));
//                    break;
//                case 4:
//                    System.out.print("Enter the base of the triangle: ");
//                    double base = scanner.nextDouble();
//                    System.out.print("Enter the height of the triangle: ");
//                    double height = scanner.nextDouble();
//                    System.out.println("Area of the triangle: " + AreaCalculator.calculateTriangleArea(base, height));
//                    break;
//                case 5:
//                    System.out.println("Exiting...");
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice!");
//            }
//            System.out.println();
//        }
        // ATM
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(1000.0); // Initial balance is $1000

        while (true) {
            System.out.println("ATM Simulator");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.displayBalance();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    }



