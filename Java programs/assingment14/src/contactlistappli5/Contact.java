package contactlistappli5;

import java.util.ArrayList;
import java.util.List;

class Contact {
    private int contactID;
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(int contactID, String name, String phoneNumber, String email) {
        this.contactID = contactID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getContactID() {
        return contactID;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactID=" + contactID +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}