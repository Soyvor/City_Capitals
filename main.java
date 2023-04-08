import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalFinder {

    public static void main(String[] args) {
        // Define a HashMap that maps each state to its corresponding capital city
        HashMap<String, String> stateToCapital = new HashMap<String, String>();
        stateToCapital.put("andhra Pradesh", "Hyderabad");
        stateToCapital.put("arunachal Pradesh", "Itanagar");
        stateToCapital.put("assam", "Dispur");
        stateToCapital.put("bihar", "Patna");
        stateToCapital.put("chhattisgarh", "Raipur");
        stateToCapital.put("goa", "Panaji");
        stateToCapital.put("gujarat", "Gandhinagar");
        stateToCapital.put("haryana", "Chandigarh");
        stateToCapital.put("himachal Pradesh", "Shimla");
        stateToCapital.put("jharkhand", "Ranchi");
        stateToCapital.put("karnataka", "Bengaluru");
        stateToCapital.put("kerala", "Thiruvananthapuram");
        stateToCapital.put("madhya Pradesh", "Bhopal");
        stateToCapital.put("maharashtra", "Mumbai");
        stateToCapital.put("manipur", "Imphal");
        stateToCapital.put("meghalaya", "Shillong");
        stateToCapital.put("mizoram", "Aizawl");
        stateToCapital.put("nagaland", "Kohima");
        stateToCapital.put("odisha", "Bhubaneswar");
        stateToCapital.put("punjab", "Chandigarh");
        stateToCapital.put("rajasthan", "Jaipur");
        stateToCapital.put("sikkim", "Gangtok");
        stateToCapital.put("tamil Nadu", "Chennai");
        stateToCapital.put("telangana", "Hyderabad");
        stateToCapital.put("tripura", "Agartala");
        stateToCapital.put("uttar Pradesh", "Lucknow");
        stateToCapital.put("uttarakhand", "Dehradun");
        stateToCapital.put("west Bengal", "Kolkata");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a state name
        System.out.print("Enter the name of a state in India: ");
        String stateName = scanner.nextLine();
        stateName=stateName.toLowerCase();

        // Look up the corresponding capital city in the HashMap
        String capitalCity = stateToCapital.get(stateName);

        // Print the result
        if (capitalCity != null) {
            System.out.println("The capital city of " + stateName + " is " + capitalCity + ".");
        } else {
            System.out.println("Sorry, we do not have the capital city for " + stateName + ".");
        }
    }

}
