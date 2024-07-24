// Collection:
// deposit and withdraw methods in BankAccount, SavingsAccount, and CheckingAccount
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
// These methods collect transaction amounts as inputs.


// Standardization:
// Validation in deposit and withdraw methods
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
// Ensures that deposits and withdrawals are valid (positive amounts, sufficient balance).


// Collection refers to gathering data, while Standardization ensures data adheres to rules or formats.

