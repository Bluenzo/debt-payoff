// This is how to create a java class: instance variables are declared private and initialized in the constructor, 
public class CreditCard {
    // instance variables, private: accessible only within this class
    private String name;
    private double apr;
    private double balance;

    // constructor
    public CreditCard(String name, double apr, double balance) {
        this.name = name;
        this.apr = apr;
        this.balance = balance;
    }

    // getter methods
    public double getApr() {
        return apr;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // toString method, used for debugging and displaying object information
    public String toString() {
        return name + " " + balance;
    }

    
}