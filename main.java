import java.util.HashMap;
import java.util.Scanner;

public class StateCapitalFinder {

    public static void main(String[] args) {
        // Define a HashMap that maps each state to its corresponding capital city
        HashMap<String, String> stateToCapital = new HashMap<String, String>();
        stateToCapital.put("Andhra Pradesh", "Hyderabad");
        stateToCapital.put("Arunachal Pradesh", "Itanagar");
        stateToCapital.put("Assam", "Dispur");
        stateToCapital.put("Bihar", "Patna");
        stateToCapital.put("Chhattisgarh", "Raipur");
        stateToCapital.put("Goa", "Panaji");
        stateToCapital.put("Gujarat", "Gandhinagar");
        stateToCapital.put("Haryana", "Chandigarh");
        stateToCapital.put("Himachal Pradesh", "Shimla");
        stateToCapital.put("Jharkhand", "Ranchi");
        stateToCapital.put("Karnataka", "Bengaluru");
        stateToCapital.put("Kerala", "Thiruvananthapuram");
        stateToCapital.put("Madhya Pradesh", "Bhopal");
        stateToCapital.put("Maharashtra", "Mumbai");
        stateToCapital.put("Manipur", "Imphal");
        stateToCapital.put("Meghalaya", "Shillong");
        stateToCapital.put("Mizoram", "Aizawl");
        stateToCapital.put("Nagaland", "Kohima");
        stateToCapital.put("Odisha", "Bhubaneswar");
        stateToCapital.put("Punjab", "Chandigarh");
        stateToCapital.put("Rajasthan", "Jaipur");
        stateToCapital.put("Sikkim", "Gangtok");
        stateToCapital.put("Tamil Nadu", "Chennai");
        stateToCapital.put("Telangana", "Hyderabad");
        stateToCapital.put("Tripura", "Agartala");
        stateToCapital.put("Uttar Pradesh", "Lucknow");
        stateToCapital.put("Uttarakhand", "Dehradun");
        stateToCapital.put("West Bengal", "Kolkata");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a state name
        System.out.print("Enter the name of a state in India: ");
        String stateName = scanner.nextLine();

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
