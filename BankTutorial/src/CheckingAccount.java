
public class CheckingAccount extends BankAccount{

		private int remainingCheck;
		
		public CheckingAccount(){
			super();
			remainingCheck = 100;
		}
		
		public CheckingAccount(String owner,double initialBalance, int remainingCheck){
			super(owner, initialBalance);
			this.remainingCheck = remainingCheck;
		}
		public void useCheck(){
			remainingCheck--;
		}
		public void getCheck(){
			remainingCheck++;
		}
}
