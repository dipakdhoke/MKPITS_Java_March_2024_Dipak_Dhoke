package uniqueemailcollector11;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailCollector {
    private Set<String> emailSet;

    public UniqueEmailCollector() {
        emailSet = new HashSet<>();
    }

    // Add a new email address to the collection
    public void addEmail(String email) {
        emailSet.add(email);
    }

    // Check if a specific email address exists
    public boolean containsEmail(String email) {
        return emailSet.contains(email);
    }

    // Remove an email address from the collection
    public void removeEmail(String email) {
        emailSet.remove(email);
    }

    // Display all unique email addresses
    public void displayEmails() {
        for (String email : emailSet) {
            System.out.println(email);
        }
    }
    public static void main(String[] args) {
        UniqueEmailCollector emailCollector = new UniqueEmailCollector();

        // Adding emails
        emailCollector.addEmail("example1@example.com");
        emailCollector.addEmail("example2@example.com");
        emailCollector.addEmail("example3@example.com");

        // Displaying emails
        System.out.println("All unique email addresses:");
        emailCollector.displayEmails();

        // Checking if an email exists
        System.out.println("Checking if 'example1@example.com' exists: " + emailCollector.containsEmail("example1@example.com"));

        // Removing an email
        emailCollector.removeEmail("example2@example.com");
        System.out.println("After removing 'example2@example.com':");
        emailCollector.displayEmails();
    }
}