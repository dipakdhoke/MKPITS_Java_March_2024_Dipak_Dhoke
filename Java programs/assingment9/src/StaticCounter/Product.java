package StaticCounter;

public class Product {
    private static int count = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        count++; // Increment the counter every time a new instance is created
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}