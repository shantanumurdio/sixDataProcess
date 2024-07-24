protected String accountNumber;
protected double balance;
// These attributes define the core data structure of an account,
//  managing account identification and balance tracking.


// Provenance:
// Constructors in BankAccount, SavingsAccount, and CheckingAccount
public BankAccount(String accountNumber, double initialBalance) {
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
}

public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
    super(accountNumber, initialBalance);
    this.interestRate = interestRate;
}

public CheckingAccount(String accountNumber, double initialBalance, double overdraftLimit) {
    super(accountNumber, initialBalance);
    this.overdraftLimit = overdraftLimit;
}

// The constructors initialize account data, setting up the initial state and tracking
//  the origins of the account data (e.g., initial balance, interest rate, overdraft limit).

// Governance involves defining the rules and policies for data management. 
// Provenance tracks the origins and history of the data.
