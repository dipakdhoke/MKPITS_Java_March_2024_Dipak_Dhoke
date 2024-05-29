package Inventorymanagement2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class InventoryManagementSystem {
    private List<Product> inventory;

    public InventoryManagementSystem() {
        inventory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        inventory.add(product);
    }

    public void updateProductQuantity(int productId, int quantity) {
        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                product.setQuantity(quantity);
                break;
            }
        }
    }

    public void removeProductById(int productId) {
        Iterator<Product> iterator = inventory.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == productId) {
                iterator.remove();
                break;
            }
        }
    }

    public void displayProductsSortedByPrice() {
        List<Product> sortedProducts = new ArrayList<>(inventory);
        sortedProducts.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product product : sortedProducts) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        ims.addProduct(new Product(1, "Laptop", 10, 999.99));
        ims.addProduct(new Product(2, "Phone", 20, 499.99));
        ims.addProduct(new Product(3, "Tablet", 15, 299.99));

        // Display all products
        System.out.println("All products:");
        ims.displayProductsSortedByPrice();
        System.out.println();

        // Update product quantity
        System.out.println("Update product quantity:");
        ims.updateProductQuantity(1, 5);
        ims.displayProductsSortedByPrice();
        System.out.println();

        // Remove product by id
        System.out.println("Remove product by id:");
        ims.removeProductById(2);
        ims.displayProductsSortedByPrice();
    }
}