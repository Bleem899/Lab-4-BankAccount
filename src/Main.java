public class Main {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount(0,-1);

        System.out.println(bank.toString());
        bank.getAccountNumber();

        bank.getBalance();
        System.out.println(bank.toString());
        System.out.println();

        bank.deposit((int)(Math.random()));
        System.out.println(bank.toString());
        System.out.println();

        bank.withdrawal((int)(Math.random()));
        System.out.println(bank.toString());
    }
}
