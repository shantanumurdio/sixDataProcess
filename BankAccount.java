public class BankAccount {
    // Attributes
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}

public class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    // Method to add interest
    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }

    @Override
    public void withdraw(double amount) {
        // Savings accounts might have withdrawal limits or penalties
        if (amount > 0 && amount <= balance) {
            super.withdraw(amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }
}

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
        super(accountNumber, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (balance + overdraftLimit) >= amount) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeds overdraft limit");
        }
    }
}

public class TestBankAccount {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SA123", 1000, 2.5);
        savingsAccount.checkBalance();
        savingsAccount.deposit(500);
        savingsAccount.checkBalance();
        savingsAccount.addInterest();
        savingsAccount.checkBalance();
        savingsAccount.withdraw(200);
        savingsAccount.checkBalance();

        System.out.println("----------------------");

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 2000, 500);
        checkingAccount.checkBalance();
        checkingAccount.deposit(1000);
        checkingAccount.checkBalance();
        checkingAccount.withdraw(2500); // Within overdraft limit
        checkingAccount.checkBalance();
        checkingAccount.withdraw(600);  // Exceeds overdraft limit
        checkingAccount.checkBalance();
    }
}