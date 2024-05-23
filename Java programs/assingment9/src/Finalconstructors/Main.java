package Finalconstructors;

public class Main {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}