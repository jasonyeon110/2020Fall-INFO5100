package Assignment8;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.security.SecureRandom;

public class Email {
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    private String companySuffix = "aeycompany.com";
    private String firstName;
    private String lastName;
    private int departmentInput;
    private String depart;

    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Ask for the department
    private String setDepartment() {
        Scanner setDev = new Scanner(System.in);

        do {
            try {
                departmentInput = setDev.nextInt();
            if (departmentInput == 1) {
//                System.out.println("Sales");
                return depart = "sales";
            } else if (departmentInput == 2) {
//                System.out.println("Development");
                return depart = "dev";
            } else if (departmentInput == 3) {
//                System.out.println("Accounting");
                return depart = "accounting";
            } else if (departmentInput == 0){
                return depart = "none";
            } else{
                System.out.println("Please put the correct Input.");
                System.out.println("1 for Sales\n" +
                        "2 for Development\n" +
                        "3 for Accounting\n" +
                        "0 for none\n" +
                        "Enter department code:");
                isDepartmentRight(departmentInput);

            }
        } catch(InputMismatchException e) {
                System.out.println("Please Try Again, only Digit 0-3");
                isDepartmentRight(departmentInput);

            }
        } while (!isDepartmentRight(departmentInput));
        return depart;
    }

    //check if the user input is correct
    public boolean isDepartmentRight(int input){
        if (input < 0 || input > 3 || !isInteger(input)) {
            return false;
        }
        return true;
    }

    public static boolean isInteger(Object input){
        if(input instanceof Integer){
            return true;
        }
        return false;
    }

    //get the Set Employee's department
    public String getDepartment(){
        return this.depart;
    }

    public int getMailBoxCapacity(){
        return this.mailboxCapacity;
    }

    // Generate a random password
    private String randomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < defaultPasswordLength; i++) {
            int randomIndex = random.nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }

        return sb.toString();
    }

    public String showInfo() {
        String s = "";
        System.out.println("New Worker: " + this.firstName + " " + this.lastName + "." + "Department Codes: \n");
        System.out.println("1 for Sales\n" +
                "2 for Development\n" +
                "3 for Accounting\n" +
                "0 for none\n" +
                "Enter department code:");
        setDepartment();
        System.out.println("DISPLAY NAME: "+ this.firstName + " " + this.lastName);
        System.out.println("DEPARTMENT: " + getDepartment());
        System.out.println("COMPANY EMAIL: " + this.firstName + "." + this.lastName + "@"+ getDepartment() + "." + companySuffix);
        System.out.println("PASSWORD: " + randomPassword(defaultPasswordLength));
        System.out.println("MAILBOX CAPACITY: " + mailboxCapacity + "MB");
        return s;
    }

}