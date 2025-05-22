import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PayoffApp {
    public static void main(String[] args) {

        // Map---------------------------------------------------------------------
        Map<String, Integer> schoolAges = new HashMap<>();
        schoolAges.put("GRC", 40);
        schoolAges.put("WSU", 100);
        schoolAges.put("BC", 35);
        schoolAges.put("WSU", 135); //it's override the old value and update with the new one



        //Print out age of WSU
        //schoolAges is the Map we are interested in then .get to get the value inside the schoolAges then the key
        // System.out.println(schoolAges.get("WSU")); 

        //print keys and values
        //this means create a variable college and put the value of the keys inside the Map schoolAges and print it
        
        //Print all keys
        // for(String college : schoolAges.keySet()){
        //     System.out.println(college);
        // }

        //Print all values
        //this means create a variable age and put the value of the values inside the Map schoolAges and print it
        // for(int age : schoolAges.values()){
        //     System.out.println(age);
        // }

        //Print key/value pairs
        //this "Map.Entry<String, Integer>" means tell java the type of the values inside the Map schoolAges and create a variable entry that store those values.
        //long version
        // for(Map.Entry<String, Integer> entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

        //short version with var, better to use in any code that need the type of the values if possible.
        // using var, java will figure out the type of something, here the type of the Map schoolAges
        // for(var entry : schoolAges.entrySet()){
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }



        //List with Map, manually----------

        // CreditCard discover = new CreditCard("Discover It", 33, 500);
        // CreditCard amex = new CreditCard("American Express", 25, 1300);

        // //create a new Map
        // //in Map <type values we put String for keys, CreditCard for values>
        // Map<String, CreditCard> cardMap = new HashMap<>();

        // //Amex is the value of the Map cardMap key as in the Map type, we put CreditCard as the values.
        // cardMap.put("American Express", amex);
        // cardMap.put("Discovery it", discover);

        // //print out
        // CreditCard myCard = cardMap.get("American Express");
        // System.out.println(myCard.getApr());


        //List------------------------------------------------------------------

        
        // // System.out.println(amex.monthlyInterest());

        // // System.out.println(amex.getApr());

        // CreditCard chase = new CreditCard("Chase", 20, 1500);
        // // System.out.println(chase.getApr());

        // // System.out.println(amex.getBalance());

        // System.out.println(chase);


        // //System.in is a standard input stream that reads data from the keyboard, but here we're using a StringReader, in the file userInput.tx
        Scanner scan = new Scanner(System.in);

        // Create an ArrayList to store the balances, <CreditCard> is a type of List that can store CreditCard objects inside the CreditCard class 
        // List: we can add, get, set, size, collection.sort(), mutable, etc.
        List<CreditCard> cards = new ArrayList<>(); //left side always put a List interface
        
        //Create a new Map
        Map<String, CreditCard> cardMap = new HashMap<>();

        while(scan.hasNextLine()) {
            String name = scan.nextLine();

            double apr = scan.nextDouble();
            double balance = scan.nextDouble();

            // Consume \n after balance input 
            if(scan.hasNextLine()) scan.nextLine();

            // Create a new CreditCard named myCard object and add it to the cards list
            CreditCard myCard = new CreditCard(name, apr, balance); 
            cards.add(myCard); //add myCard object to cards list
            cardMap.put(name, myCard);

            // //String.format() is used to format a string with placeholders, %.2f formats a double to two decimal places
            // String aprString = String.format("%.2f%%", apr);
            // String balanceString = String.format("$%.2f", balance);
            // System.out.println(name + ": " + "APR: " + aprString + " Balance: " + balanceString);
        }

        // System.out.println("not Sorted: " + cards);

        // // Collections.sort(cards); //Sorts the list in ascending order by default
        // System.out.println("Sorted Balances in ascending order: " + cards);

        // Collections.sort(cards, Collections.reverseOrder()); //Sorts the list in descending order);
        // System.out.println("Sorted Balances in descending order: " + cards);

        //print out the list with the map
        System.out.println(cardMap);

        scan.close(); //Close the scanner to prevent resource leaks
     }
}
