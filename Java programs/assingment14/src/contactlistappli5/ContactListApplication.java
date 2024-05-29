package contactlistappli5;

import java.util.ArrayList;
import java.util.List;

public class ContactListApplication {
    private List<Contact> contacts;

    public ContactListApplication() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContactById(int contactID) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getContactID() == contactID) {
                contacts.remove(i);
                break;
            }
        }
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null;
    }

    public void updateContactDetails(int contactID, String phoneNumber, String email) {
        for (Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                break;
            }
        }
    }

    public static void main(String[] args) {
        ContactListApplication contactApp = new ContactListApplication();
        contactApp.addContact(new Contact(1, "John Doe", "1234567890", "john@example.com"));
        contactApp.addContact(new Contact(2, "Jane Smith", "9876543210", "jane@example.com"));

        // Display all contacts
        System.out.println("All contacts:");
        for (Contact contact : contactApp.contacts) {
            System.out.println(contact);
        }
        System.out.println();

        // Remove a contact by ID
        contactApp.removeContactById(1);

        // Display all contacts after removing one
        System.out.println("All contacts after removing one:");
        for (Contact contact : contactApp.contacts) {
            System.out.println(contact);
        }
        System.out.println();

        // Find and display a contact by name
        System.out.println("Find and display a contact by name:");
        Contact foundContact = contactApp.findContactByName("Jane Smith");
        if (foundContact != null) {
            System.out.println(foundContact);
        } else {
            System.out.println("Contact not found");
        }
        System.out.println();

        // Update contact details
        System.out.println("Update contact details:");
        contactApp.updateContactDetails(2, "9998887770", "jane.smith@example.com");
        Contact updatedContact = contactApp.findContactByName("Jane Smith");
        if (updatedContact != null) {
            System.out.println(updatedContact);
        } else {
            System.out.println("Contact not found");
        }
    }
}