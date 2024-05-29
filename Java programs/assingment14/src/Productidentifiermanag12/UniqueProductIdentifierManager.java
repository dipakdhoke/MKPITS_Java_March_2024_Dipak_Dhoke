package Productidentifiermanag12;

import java.util.HashSet;
import java.util.Set;

public class UniqueProductIdentifierManager {
    private Set<String> identifierSet;

    public UniqueProductIdentifierManager() {
        identifierSet = new HashSet<>();
    }

    // Add a new product identifier to the collection
    public void addIdentifier(String identifier) {
        identifierSet.add(identifier);
    }

    // Check if a specific product identifier exists
    public boolean containsIdentifier(String identifier) {
        return identifierSet.contains(identifier);
    }

    // Remove a product identifier from the collection
    public void removeIdentifier(String identifier) {
        identifierSet.remove(identifier);
    }

    // Display all unique product identifiers
    public void displayIdentifiers() {
        for (String identifier : identifierSet) {
            System.out.println(identifier);
        }
    }

    public static void main(String[] args) {
        UniqueProductIdentifierManager manager = new UniqueProductIdentifierManager();

        // Adding identifiers
        manager.addIdentifier("SKU123");
        manager.addIdentifier("SKU456");
        manager.addIdentifier("SKU789");

        // Displaying identifiers
        System.out.println("All unique product identifiers:");
        manager.displayIdentifiers();

        // Checking if an identifier exists
        System.out.println("Checking if 'SKU123' exists: " + manager.containsIdentifier("SKU123"));

        // Removing an identifier
        manager.removeIdentifier("SKU456");
        System.out.println("After removing 'SKU456':");
        manager.displayIdentifiers();
    }
}
