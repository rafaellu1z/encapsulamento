package entities;

public class Account {
	
	private static final double WITHDRAW_TAX = 5.00; 
	private String holder;
	private int accountNumber;
	private double balance;
	
	public Account(String holder, int accountNumber) {
		this.holder = holder;
		this.accountNumber = accountNumber;
	}
	
	public Account(String holder, int accountNumber, double initialDeposit) {
		this.holder = holder;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}

	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount + WITHDRAW_TAX;
	}
	
	public String toString() {
		return "Account " 
				+ accountNumber
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
	
}
