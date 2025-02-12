import java.util.Scanner;

class Bank_Account {
    double accountNo;
    String userName,email,accountType; 
    double accountBalance;

    public Bank_Account(double accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails(Scanner sc) {
        System.out.println("Enter Account Number: ");
        this.accountNo = sc.nextDouble();  
        sc.nextLine(); 

        System.out.println("Enter User Name: ");
        this.userName = sc.nextLine();  

        System.out.println("Enter Email: ");
        this.email = sc.nextLine();  

        System.out.println("Enter Account Type: ");
        this.accountType = sc.nextLine();  

        System.out.println("Enter Account Balance: ");
        this.accountBalance = sc.nextDouble(); 
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("User Name: " + this.userName);
        System.out.println("Email: " + this.email);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Account Balance: " + this.accountBalance);
    }
}

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Bank_Account account = new Bank_Account(0, "", "", "", 0);

        account.getAccountDetails(sc);

        account.displayAccountDetails();
    }
}
