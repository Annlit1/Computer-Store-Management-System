package models;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;


//    public Product(int id, String name, String category, double price, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.category = category;
//        this.price = price;
//        this.quantity = quantity;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public void setCategory(String category) {
        if (category == null) {
            throw new IllegalArgumentException("Category cannot be null");
        }
        this.category = category;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public void setStockQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantity = quantity;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + " | Category: " + category + " | Price: " + price + " | Stock: " + quantity);
    }
}
