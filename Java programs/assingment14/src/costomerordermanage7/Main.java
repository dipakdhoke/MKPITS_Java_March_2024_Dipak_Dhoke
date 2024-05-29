package costomerordermanage7;

public class Main {
    public static void main(String[] args) {
        CustomerOrderManagement orderManagement = new CustomerOrderManagement();
        orderManagement.addOrder(1, "John", "Laptop", 2, "2022-12-10");
        orderManagement.addOrder(2, "Alice", "Mobile", 3, "2022-12-15");
        orderManagement.addOrder(3, "Bob", "Tablet", 1, "2022-12-20");

        // Display all orders
        orderManagement.displayAllOrders();
        System.out.println();

        // Update the quantity of an order
        orderManagement.updateOrderQuantity(2, 5);

        // Display all orders after updating quantity
        orderManagement.displayAllOrders();
        System.out.println();

        // Remove an order by ID
        orderManagement.removeOrderById(1);

        // Display all orders after removing one
        orderManagement.displayAllOrders();
        System.out.println();

        // Display all orders sorted by order date
        orderManagement.displayOrdersSortedByOrderDate();
    }
}