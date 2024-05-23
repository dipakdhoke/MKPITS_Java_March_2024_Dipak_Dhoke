public class AreaCalculator {
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}

