package finalmethodusage;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, 3);
        System.out.println("Result of adding 5 and 3: " + result);
    }
}