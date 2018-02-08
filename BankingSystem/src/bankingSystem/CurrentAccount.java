package bankingSystem;

public class CurrentAccount extends BankingSystem{
	
	CurrentAccount(String name,float depositBalance,float rateOfInterest){
		super(name, Account.CURRENT.value, depositBalance, rateOfInterest);
	}

	@Override
	public Boolean withdraw(float money) {
		Boolean success = Boolean.FALSE;
		if(this.getBalance() >= money & money > 0 ){
			this.setBalance(this.getBalance() - money);
			success = Boolean.TRUE;
		}
		return success;
	}
	
}
