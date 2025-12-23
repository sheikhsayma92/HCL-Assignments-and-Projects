package Assignment1;

class BankAccount {
	private String accountHolderName;
	private String accountNumber;
	private double balance;

	// Constructor
	public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		if (initialBalance < 0) {
			throw new IllegalArgumentException("Initial balance cannot be negative!");
		}
		this.balance = initialBalance;
	}

	// Deposit method
	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Deposit amount must be positive!");
		}
		balance += amount;
		System.out.println("Successfully deposited: " + amount);
	}

	// Withdraw method
	public void withdraw(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Withdrawal amount must be positive!");
		}
		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient balance!");
		}
		balance -= amount;
		System.out.println("Successfully withdrawn: " + amount);
	}

	// Balance enquiry
	public double getBalance() {
		return balance;
	}

	// Display account details
	public void displayAccountDetails() {
		System.out.println("\n--- Account Details ---");
		System.out.println("Account Holder: " + accountHolderName);
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Current Balance: " + balance);
	}
}
