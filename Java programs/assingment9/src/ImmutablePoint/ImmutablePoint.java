package ImmutablePoint;

public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;

    }
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(5, 10);
        System.out.println("Point coordinates: (" + point.getX() + ", " + point.getY() + ")");
    }
}
