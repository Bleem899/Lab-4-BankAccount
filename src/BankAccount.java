import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;
    Scanner s = new Scanner(System.in);

    public BankAccount(double amount, int acctNum){
        balance = amount;
        accountNumber = acctNum;
    }
    public int getAccountNumber(){
        System.out.print("What is your account number? ");
        accountNumber = s.nextInt();
        return accountNumber;
    }

    public double getBalance() {
        System.out.print("What is your current balance? ");
        balance = s.nextInt();
        return balance;
    }
    public void deposit(double amount){
        System.out.print("How much would you like to deposit? ");
        amount = s.nextInt();
        if(amount > 0){
            System.out.println("After a deposit.");
            balance += amount;
        }
        else{
            System.out.println("Would you rather make a withdrawal?");
        }
    }
    public double withdrawal(double amount){
        System.out.print("How much would you like to withdrawal? ");
        amount = s.nextInt();
        if(amount > 0 && amount < balance){
            System.out.println("After a withdrawal.");
            balance -= amount;
        }
        else{
            System.out.println("That will cause an overdraft.");
        }
        return amount;
    }

    public String toString() {
        return "Acct #: " + accountNumber + ", Balance: $" + balance;
    }
}
