package finalclass;

public class Main {
    public static void main(String[] args) {
        System.out.println("Value of PI: " + MathConstants.PI);
        System.out.println("Value of E: " + MathConstants.E);

        double radius = 5.0;
        double circumference = 2 * MathConstants.PI * radius;
        System.out.println("Circumference of a circle with radius " + radius + " is: " + circumference);

        double base = 2.0;
        double radius2 = 3.0;
        double areacircle  =MathConstants.PI*radius2*radius2;
        System.out.println(areacircle);
    }
}
