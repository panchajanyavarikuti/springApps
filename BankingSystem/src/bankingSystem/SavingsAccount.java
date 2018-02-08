package bankingSystem;

public class SavingsAccount extends BankingSystem{
	
	SavingsAccount(String name,float depositBalance,float rateOfInterest){
		super(name, Account.SAVINGS.value, depositBalance, rateOfInterest);
		this.resetWidthdrawlsCount();
	}

	@Override
	public Boolean withdraw(float money) {
		Boolean success = Boolean.FALSE;
		if(getNumberOfWidthdrawls() != 0 & this.getBalance() >= money & money > 0 ){
			this.setBalance(this.getBalance() - money);
			success = Boolean.TRUE;
			setNumberOfWidthdrawls(getNumberOfWidthdrawls() - 1) ;
		}
		return success;
	}
	
}
