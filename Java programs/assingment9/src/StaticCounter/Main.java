package StaticCounter;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Phone", 500);
        Product product2 = new Product("Laptop", 1000);
        Product product3 = new Product("Tablet", 300);

        System.out.println("Number of products created: " + Product.getCount());
    }
}