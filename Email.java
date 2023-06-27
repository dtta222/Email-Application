package emailapp;

import java.util.*;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private String companySuffix = "anycompany.com";
    private int mailboxCap = 500;
    private int defaultPasswordLength = 10;

    // constructor to receive first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

        // call method, ask for dept, return dept
        this.department = setDepartment();

        // call method return random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
    }
    // Ask for the department
    private String setDepartment(){
        System.out.print("New Worker: " + firstName + "\nDEPARTMENT CODES: \n1 for Sales\n2 for Development \n3 for Accounting \n0 for none \nEnter the department code: ");
        Scanner in = new Scanner(System.in);

        int deptChoice = in.nextInt();

        if(deptChoice == 1){return "sales";}
        else if(deptChoice == 2){return "dev";}
        else if(deptChoice == 3){  return "acct";}
        else{return "";}
    }

    // generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        char[] password = new char[length];
        for(int i = 0; i < length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // set mailbox capacity
    public void setMailboxCap(int cap){
        this.mailboxCap = cap;
    }

    // set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //change password
    public void changePassword(String password){
        this.password = password;
    }

    // get methods
    public int getMailboxCap(){return mailboxCap;}
    public String getAlternateEmail(){return alternateEmail;}
    public String getPassword(){return password;}

    // method to display name, email, and mailbox capacity
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: "+ mailboxCap + "mb";
    }

}
