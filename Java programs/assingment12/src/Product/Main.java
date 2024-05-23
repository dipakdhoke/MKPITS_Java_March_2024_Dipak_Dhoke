package Product;

public class Main {
    public static void main(String[] args) {
        Product electronic=new Product() {
            @Override
            public double calculatePrice(double price) {
                return price;
            }

            @Override
            public void displayDetails(String name, String brand) {
                System.out.println("Electronics Details:");
                System.out.println("Name: " + name);
                System.out.println("Brand: " + brand);
            }
        };
        Product cloth =new Product() {
            @Override
            public double calculatePrice(double price) {
                return price;
            }

            @Override
            public void displayDetails(String name, String brand) {
                System.out.println("Electronics Details:");
                System.out.println("Name: " + name);
                System.out.println("Brand: " + brand);
            }
        };
        Product books=new Product() {
            @Override
            public double calculatePrice(double price) {
                return price;
            }

            @Override
            public void displayDetails(String name, String brand) {
                System.out.println("Electronics Details:");
                System.out.println("Name: " + name);
                System.out.println("Brand: " + brand);
            }
        };
    }
}
