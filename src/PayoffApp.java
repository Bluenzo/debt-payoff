import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {

        CreditCard discover = new CreditCard("Discover It", 33, 500);

        CreditCard amex = new CreditCard("American Express", 25, 1300);

        // System.out.println(amex.monthlyInterest());

        // System.out.println(amex.getApr());

        CreditCard chase = new CreditCard("Chase", 20, 1500);
        // System.out.println(chase.getApr());

        // System.out.println(amex.getBalance());

        System.out.println(chase);


        //System.in is a standard input stream that reads data from the keyboard, but here we're using a StringReader, in the file userInput.tx
        Scanner scan = new Scanner(System.in);

        // Create an ArrayList to store the balances, <CreditCard> is a type of List that can store CreditCard objects inside the CreditCard class 
        // List: we can add, get, set, size, collection.sort(), mutable, etc.
        List<CreditCard> cards = new ArrayList<>(); //left side always put a List interface

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            // Create a new CreditCard object and add it to the cards list
            CreditCard myCard = new CreditCard(name, apr, balance); 
            cards.add(myCard); //add myCard object to cards list

            //String.format() is used to format a string with placeholders, %.2f formats a double to two decimal places
            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        System.out.println("not Sorted: " + cards);

        // Collections.sort(cards); //Sorts the list in ascending order by default
        System.out.println("Sorted Balances in ascending order: " + cards);

        Collections.sort(cards, Collections.reverseOrder()); //Sorts the list in descending order);
        System.out.println("Sorted Balances in descending order: " + cards);


        scan.close(); //Close the scanner to prevent resource leaks
     }
}
