package day6;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= amount;
        }
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount("123456789", "John Doe", 1000.0);

        System.out.println("Initial balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(2000.0);
        System.out.println("Balance after attempted withdrawal: " + account.getBalance());

        account.withdraw(500.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());

	}

}
