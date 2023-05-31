/*

Create a class named "BankAccount" with two subclasses "SavingsAccount" and "CheckingAccount". Implement hierarchical inheritance to extend the "BankAccount" class to both 
the "SavingsAccount" and "CheckingAccount" classes. Add appropriate properties and methods to each class and demonstrate their use in the main method.

*/

class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialDeposit, double interestRate) {
        super(accountNumber, initialDeposit);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount(String accountNumber, double initialDeposit, double monthlyFee) {
        super(accountNumber, initialDeposit);
        this.monthlyFee = monthlyFee;
    }

    public void deductMonthlyFee() {
        balance -= monthlyFee;
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("123456", 1000, 0.05);
        CheckingAccount checking = new CheckingAccount("789012", 500, 10);

        savings.deposit(500);
        checking.withdraw(100);

        double savingsInterest = savings.calculateInterest();
        checking.deductMonthlyFee();

        System.out.println("Savings account balance: " + savings.getBalance());
        System.out.println("Checking account balance: " + checking.getBalance());
        System.out.println("Savings account interest: " + savingsInterest);
    }
}
