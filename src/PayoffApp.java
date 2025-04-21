import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {
        //System.in is a standard input stream that reads data from the keyboard, but here we're using a StringReader, in the file userInput.tx
        Scanner scan = new Scanner(System.in);

        // Create an ArrayList to store the balances, using List<Double> for better performance and memory efficiency
        // List: we can add, get, set, size, collection.sort(), mutable, etc.
        List<Double> balances = new ArrayList<Double>(); //left side always put a List interface

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            balances.add(balance); //add the balance to the list named balances.

            //String.format() is used to format a string with placeholders, %.2f formats a double to two decimal places
            String aprString = String.format("%.2f%%", apr);
            String balanceString = String.format("$%.2f", balance);
            System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        System.out.println("not Sorted: " + balances);

        Collections.sort(balances); //Sorts the list in ascending order by default
        System.out.println("Sorted Balances in ascending order: " + balances);

        Collections.sort(balances, Collections.reverseOrder()); //Sorts the list in descending order);
        System.out.println("Sorted Balances in descending order: " + balances);


        scan.close(); //Close the scanner to prevent resource leaks
    }
}
