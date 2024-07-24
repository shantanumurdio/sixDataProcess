// Application:
// TestBankAccount class
public class TestBankAccountApplication {
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
// Demonstrates how to apply the methods of SavingsAccount and CheckingAccount 
// to perform real transactions, check balances, and manage accounts.



// Application refers to using data methods and functionalities in practical scenarios
