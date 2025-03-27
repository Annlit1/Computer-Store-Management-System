package models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int id;
    private Customer customer;
    public List<Product> products;
    public List<Integer> quantities;
    public String orderDate;
    public String status;

    public Order(int id, Customer customer, List<Product> products, List<Integer> quantities,
                 String orderDate) {
        this.id = id;
        this.customer = customer;
        this.products = products;
        this.quantities = quantities;
        this.orderDate = orderDate;
        this.status = "New";
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double calculateTotalValue() {
        double total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice() * quantities.get(i);
        }

        return total;
    }

    public double applyDiscount() {
        double total = calculateTotalValue();
        if (customer.getLoyalCustomer()) {
            total *= 0.9;
        }
        return total;
    }

    public void displayDetails() {
        System.out.println("Order ID: " + id + " | Status: " + status);
        customer.displayInfo();
        System.out.println("Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).getName() + " x" + quantities.get(i));
        }
        System.out.println("Total: " + applyDiscount());
    }

}
