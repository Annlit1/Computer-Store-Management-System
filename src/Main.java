import models.ComputerStore;
import models.Product;
import models.Customer;
import models.Order;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the computer store
        ComputerStore store = new ComputerStore();

        // Add products
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Laptop Dell XPS 13");
        product1.setCategory("Laptop");
        product1.setPrice(4999.99);
        product1.setStockQuantity(10);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Mouse Logitech MX Master 3");
        product2.setCategory("Mouse");
        product2.setPrice(349.99);
        product2.setStockQuantity(30);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Monitor Samsung 27");
        product3.setCategory("Monitor");
        product3.setPrice(1299.99);
        product3.setStockQuantity(15);

        store.addProduct(product1);
        store.addProduct(product2);
        store.addProduct(product3);

        // Add customers
        Customer customer1 = new Customer();
        customer1.setId(1);
        customer1.setFirstName("John");
        customer1.setLastName("Smith");
        customer1.setEmail("john.smith@example.com");
        customer1.setIsLoyalCustomer(true);

        Customer customer2 = new Customer();
        customer2.setId(2);
        customer2.setFirstName("Anna");
        customer2.setLastName("Brown");
        customer2.setEmail("anna.brown@example.com");
        customer2.setIsLoyalCustomer(false);

        store.addCustomer(customer1);
        store.addCustomer(customer2);

        // Create orders
//        Product[] orderProducts1 = {product1, product2};
//        int[] orderQuantities1 = {1, 1};
        List<Product> orderProducts1= List.of(product1,product2);
        List<Integer> orderQuantities1 = List.of(1,1);
        Order order1 = store.createOrder(customer1, orderProducts1, orderQuantities1);
        order1.applyDiscount(); // Apply discount for a loyal customer
        store.updateStockAfterOrder(order1);

        // Display information
        System.out.println("Order details:");
        order1.displayDetails();
        System.out.println("\nStock levels after the order:");
        store.displayProductsInCategory("Laptop");
        store.displayProductsInCategory("Mouse");

        // Change order status
        store.changeOrderStatus(order1.getId(), "Completed");
        System.out.println("\nOrder status after update:");
        order1.displayDetails();

        // Add another order
//        Product[] orderProducts2 = {product3, product2};
//        int[] orderQuantities2 = {2, 1};
        List<Product> orderProducts2= List.of(product3,product2);
        List<Integer> orderQuantities2 = List.of(2,1);

        Order order2 = store.createOrder(customer2, orderProducts2, orderQuantities2);
        store.updateStockAfterOrder(order2);

        // Display customer orders
        System.out.println("\nOrders of John Smith:");
        store.displayCustomerOrders(1);
    }
}