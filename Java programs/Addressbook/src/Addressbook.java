 import java.util.Scanner;

    public class Addressbook {
        private static final int MAX_CONTACTS = 100;
        private static final Contact[] contacts = new Contact[MAX_CONTACTS];
        private static int contactCount = 0;
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("Address Book");
                System.out.println("1. Add Contact");
                System.out.println("2. Display Contacts");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        addContact();
                        break;
                    case 2:
                        displayContacts();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice!");
                }
                System.out.println();
            }
        }

        private static void addContact() {
            if (contactCount < MAX_CONTACTS) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter phone number: ");
                String phoneNumber = scanner.next();
                System.out.print("Enter email: ");
                String email = scanner.next();
                contacts[contactCount] = new Contact(name, phoneNumber, email);
                contactCount++;
                System.out.println("Contact added successfully!");
            } else {
                System.out.println("Address book is full. Cannot add more contacts.");
            }
        }

        private static void displayContacts() {
            if (contactCount == 0) {
                System.out.println("No contacts found.");
            } else {
                System.out.println("Contacts in the address book:");
                for (int i = 0; i < contactCount; i++) {
                    System.out.println(contacts[i]);
                }
            }
        }

        static class Contact {
            private String name;
            private String phoneNumber;
            private String email;

            public Contact(String name, String phoneNumber, String email) {
                this.name = name;
                this.phoneNumber = phoneNumber;
                this.email = email;
            }

            @Override
            public String toString() {
                return "Name: " + name + "\nPhone: " + phoneNumber + "\nEmail: " + email + "\n";
            }
        }
    }
