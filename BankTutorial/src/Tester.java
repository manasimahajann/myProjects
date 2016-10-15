
public class Tester {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount("Neha",25);
		printit(ba.getOwner());
		printit(ba.getBalance());
		printit("------------------");
		SavingsAccount sa = new SavingsAccount("Bob", 125);
		sa.deposit(20);
		sa.addInterest();
		printit(sa.getOwner());
		printit(sa.getBalance());
		printit("--------------------------");
		CheckingAccount ca = new CheckingAccount("Ryan", 250, 250);
		ca.withdraw(25);
		ca.useCheck();
		printit(ca.getBalance());
		printit("-----------------------------");
		
		CheckingAccountFees cafees = new CheckingAccountFees("Dyan", 500, 20);
		cafees.withdraw(25);
		cafees.DeductFees();
		cafees.useCheck();
		printit(cafees.getBalance());
				
	}
	
	public static void printit(Object o){
		System.out.println(o);
	}
}
