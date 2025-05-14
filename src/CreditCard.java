// This is how to create a java class: instance variables are declared private and initialized in the constructor, 
public class CreditCard implements Comparable<CreditCard> { //this means we can compare CreditCard to another Creditcard
    
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
        return name + " " + monthlyInterest();
    }

    public double monthlyInterest(){
        return balance * apr / 12 / 100;
    }

    // we need this methode in order to use the implements Comparable<CreditCard>, and compare what comparable 
    public int compareTo(CreditCard other){

        // double myInterest = balance * apr / 12 / 100;
        // double otherInterest = other.balance * other.apr / 12 / 100;

        // if(myInterest > otherInterest) {
        //     return 1;
        // }

        // if(myInterest < otherInterest){
        //     return -1;
        // }

        //because we have the methode monthleInterest
        //Instead of using those double variable: we do

        if(monthlyInterest()> other.monthlyInterest()) {
            return 1;
        }

        if(monthlyInterest() < other.monthlyInterest()){
            return -1;
        }
        
        return 0;

    }
    
}