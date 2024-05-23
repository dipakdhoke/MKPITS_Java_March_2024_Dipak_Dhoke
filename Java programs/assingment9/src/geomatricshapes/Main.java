package geomatricshapes;

public class Main {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Sphere Area: " + sphere.area());
        System.out.println("Sphere Volume: " + sphere.volume());

        Cube cube = new Cube(4);
        System.out.println("Cube Area: " + cube.area());
        System.out.println("Cube Volume: " + cube.volume());

        Cylinder cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder Area: " + cylinder.area());
        System.out.println("Cylinder Volume: " + cylinder.volume());
    }
}
