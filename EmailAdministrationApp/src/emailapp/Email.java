package emailapp;

import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName; // Corrected variable name
    private String password;
    private String department;
    private int mailboxCapacity;
    private String Email;
    private String alternateEmail;
    private int defaultPasswordLength = 10; // Initialized with a default length
    private String companySu="imc@Gmail.com";


    // Constructor to receive firstName & lastName
    Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
        System.out.println("Email Created: " + this.firstName + " " + this.lastName);
        
        // Call a method to determine the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);
        
        // Call a method that generates a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password: " + this.password);
        
        //combine elements to generate email
        Email= firstName.toLowerCase() +"." +lastName.toLowerCase()+"@"+department+"."+companySu;
        System.out.println("your email is:-"+Email);
    }

    // Determine the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code:");
        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        if (departmentChoice == 1) { 
            return "Sales";
        } else if (departmentChoice == 2) {
            return "Development";
        } else if (departmentChoice == 3) {
            return "Accounting";
        } else {
            return "";
        }
        // Consider closing the Scanner if it won't be used elsewhere or if it's a one-time use
        // sc.close();
    }

    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()_+={}:"; // Corrected character set
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length()); // Corrected method call
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    
    

    // set mailbox capacity
    
    public void setmailboxCapacity(int Capacity) {
    	this.mailboxCapacity=Capacity;
    }
    
    //set the alternate email
    public void setAlternateEmail(String altEmail) {
    	this.alternateEmail=altEmail;
    }
    //and change the password here
    public void changePassword(String password) {
    	this.password= password;
    }
    public int getmailboxCapacity() {
    	return mailboxCapacity;
    }
    public String getAlternateEmail() {
    	return alternateEmail;
    }
    public String getpassword() {
    	return password;
    }
    public String showInfo() {
    	return "DisplayName"+ firstName+""+lastName+
    			"CompanyEmail"+Email +
    			"MailBox Capacity"+ mailboxCapacity+"mb";
    }
}
