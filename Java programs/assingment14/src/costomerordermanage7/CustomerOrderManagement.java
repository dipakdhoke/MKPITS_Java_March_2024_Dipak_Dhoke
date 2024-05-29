package costomerordermanage7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomerOrderManagement {
    private List<Order> orders;

    public CustomerOrderManagement() {
        orders = new ArrayList<>();
    }

    public void addOrder(int orderId, String customerName, String product, int quantity, String orderDate) {
        orders.add(new Order(orderId, customerName, product, quantity, orderDate));
    }

    public void updateOrderQuantity(int orderId, int newQuantity) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                order.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println("Order not found");
    }

    public void removeOrderById(int orderId) {
        orders.removeIf(order -> order.getOrderId() == orderId);
    }

    public void displayAllOrders() {
        System.out.println("All orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void displayOrdersSortedByOrderDate() {
        Collections.sort(orders, Comparator.comparing(Order::getOrderDate));
        System.out.println("Orders sorted by order date:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

