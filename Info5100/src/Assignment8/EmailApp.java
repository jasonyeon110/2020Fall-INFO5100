package Assignment8;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("John", "Smith");
        System.out.println(em1.showInfo());
    }
}

/*New Worker: John Smith. Department Codes:
1 for Sales
2 for Development
3 for Accounting
0 for none
Enter department code:
2
DISPLAY NAME: John Smith
DEPARTMENT: dev
COMPANY EMAIL: john.smith@dev.aeycompany.com
PASSWORD: 76G0Y4BXOJ
MAILBOX CAPACITY: 500mb*/