
public class CheckingAccountFees extends CheckingAccount {
		private final double FEES = 10;
	public CheckingAccountFees(){
		super();
	}
	public CheckingAccountFees(String owner, double initialBalance, int initialCheckCount){
		super(owner, initialBalance, initialCheckCount);
		
	}

	public void DeductFees(){
		 this.withdraw(FEES);
	}
}
