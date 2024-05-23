package geomatricshapes;

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double volume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
