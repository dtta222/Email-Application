/*
Email Application
Task: create email accounts for new hires.

App should do the following:

- Generate an email with the following syntax: firstname.lastname@department.company.com
- Determine the department (sales, development, accounting), if none leave blank
- Generate a random String for a password
- Have set methods to change the password, set the mailbox capacity, and define an alternate email address
- Have get methods to display the name, email, and mailbox capacity
 */

package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        System.out.println("Hello world!\n");

        Email email1 = new Email("John", "Doe");

        email1.setAlternateEmail("JD@altemail.com");

        System.out.println("Alternate Email: " + email1.getAlternateEmail());

        System.out.println(email1.showInfo());
    }
}