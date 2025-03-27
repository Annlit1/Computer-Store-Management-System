package models;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean isLoyalCustomer;

//    public Customer(int id, String firstName, String lastName, String email, Boolean isLoyalCustomer) {
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.isLoyalCustomer = isLoyalCustomer;
//    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        if (firstName == null) {
            throw new NullPointerException("First name cannot be null");
        }
        if (firstName.trim().equals("")) {
            throw new IllegalArgumentException("First name cannot be empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null) {
            throw new NullPointerException("Last name cannot be null");
        }
        if (lastName.trim().equals("")) {
            throw new IllegalArgumentException("Last name cannot be empty");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        this.email = email;
    }

    public void setIsLoyalCustomer(Boolean loyalCustomer) {
        isLoyalCustomer = loyalCustomer;
    }

    public Boolean getLoyalCustomer() {
        return isLoyalCustomer;
    }

    public void displayInfo() {
        System.out.println("Customer: " + firstName + " " + lastName + " | Email: " + email + " | Loyal: " + isLoyalCustomer);
    }
}
