package murachbusiness;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable 
{
    private String firstName;
    private String lastName;
    private String email;
    private String doBirth;
    private String hear;
    private String select;
    private String contact;
    
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        doBirth = null;
        hear = "";
        select = "";
        contact = "";
    }
    
    public User(String firstName, String lastName, String email, String doBirth, String hear, String select, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.doBirth = doBirth;
        this.hear = hear ;
        this.select = select; 
        this.contact = contact;
    }   
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
      // Getter for doBirth
    public String getDoBirth() {
        return doBirth;
    }

    // Setter for doBirth
    public void setDoBirth(String doBirth) {
        this.doBirth = doBirth;
    }

    // Getter for hear
    public String getHear() {
        return hear;
    }

    // Setter for hear
    public void setHear(String hear) {
        this.hear = hear;
    }

    // Getter for select
    public String getSelect() {
        return select;
    }

    // Setter for select
    public void setSelect(String select) {
        this.select = select;
    }

    // Getter for contact
    public String getContact() {
        return contact;
    }

    // Setter for contact
    public void setContact(String contact) {
        this.contact = contact;
    }
}