public void addInterest() {
    double interest = balance * (interestRate / 100);
    balance += interest;
    System.out.println("Interest added: $" + interest);
}
// This method generates new balance data by calculating and adding interest to the existing balance.



// deposit and withdraw methods in BankAccount, SavingsAccount, and CheckingAccount:
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
// These methods generate new balance values by adding deposits or subtracting withdrawals from the current balance.


// Generation involves creating new data or deriving values from existing data.
