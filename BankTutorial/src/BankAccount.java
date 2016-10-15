
public class BankAccount {
	
	private String owner;
	private double balance;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
		owner = "Manasi Mahajan";
		balance = 0.0;
		
	}
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	public void deposit(double amount){
		balance += amount;
	}
	public void withdraw(double amount){
		
		balance -= amount;
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public double getBalance(){
		return this.balance;
	}
}
