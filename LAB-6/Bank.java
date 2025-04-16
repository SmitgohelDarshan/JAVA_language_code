import java.util.Scanner;

class Bank_Account {
    double accountNo;
    String userName; 
    double accountBalance;

    public Bank_Account(double accountNo, String userName, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.accountBalance = accountBalance;
    }
    public void withdraw(double bal,double amount){
        
        if(bal-amount<1000){
            System.out.println("Insuffient Balance");
        }
        else{
            accountBalance -= amount; 
            accountBalance=bal;
        }   
    }

    public void exit(){
        System.out.println(accountBalance);
    }

}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount=0;
        System.out.println("Enter Account Number: ");
        double accountNo = sc.nextDouble();  
        sc.nextLine(); 
        
        System.out.println("Enter User Name: ");
        String userName = sc.nextLine();  

        System.out.println("Enter Account Balance: ");
        double accountBalance = sc.nextDouble(); 
        
        while(true){

            System.out.println("Press 1 for Deposite \nPress 2 for withdraw \nPress Any Other to Exit");
            int op = sc.nextInt();

            if(op==1){
                System.out.println("Enter Amount to Deposite");
                amount = sc.nextInt();
                accountBalance += amount; 
            }
            else if(op==2){
                System.out.println("Enter Amount to Withdraw");
                amount = sc.nextInt();
            }
            else{
                break;
            }

        }
        
        Bank_Account account = new Bank_Account(accountNo, userName, accountBalance);

        account.withdraw(1000,amount);
        // account.exit();
    }
}
