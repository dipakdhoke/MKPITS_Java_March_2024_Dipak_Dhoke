package geomatricshapes;

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }
}
