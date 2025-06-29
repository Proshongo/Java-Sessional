class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    static String bankName = "National Bank";

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("576434664", "Proshongo", 50000000.0);
        BankAccount account2 = new BankAccount("575434616", "Smite", 700000.0);
        BankAccount.showbankName();
        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
