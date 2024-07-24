// Aggregation:
// addInterest method in SavingsAccount
public void addInterest() {
    double interest = balance * (interestRate / 100);
    balance += interest;
    System.out.println("Interest added: $" + interest);
}
// Aggregates the calculated interest into the current balance


// withdraw method in CheckingAccount:
@Override
public void withdraw(double amount) {
    if (amount > 0 && (balance + overdraftLimit) >= amount) {
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    } else {
        System.out.println("Invalid withdrawal amount or exceeds overdraft limit");
    }
}
// Aggregates the balance and overdraft limit to determine if the withdrawal can be processed.



// Aggregation involves combining data from multiple sources to produce a result.

