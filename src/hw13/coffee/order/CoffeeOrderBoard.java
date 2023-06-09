package hw13.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orders;
    private int orderNumber;

    public CoffeeOrderBoard() {
        this.orders = new ArrayList<>();
        this.orderNumber = 1;
    }

    public void add(String name) {
        Order order = new Order(orderNumber++, name);
        orders.add(order);
    }

    public void deliver() {
        if (!orders.isEmpty()) {
            Order order = orders.get(0);
            System.out.println("Delivering order: " + order.getOrderNumber() + " - " + order.getName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver.");
        }
    }

    public void deliver(int orderNumber) {
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == orderNumber) {
                System.out.println("Delivering order: " + order.getOrderNumber() + " - " + order.getName());
                orders.remove(i);
                return;
            }
        }
        System.out.println("Order " + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("Num : Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " : " + order.getName());
        }
    }
}
