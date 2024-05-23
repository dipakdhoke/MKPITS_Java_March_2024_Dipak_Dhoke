package Shape;

public class Main {
    public static void main(String[] args) {
        int r;
        shape circle = new shape() {
            @Override
            public void area() {
                System.out.println(Math.PI);
            }
        };

    }
}
