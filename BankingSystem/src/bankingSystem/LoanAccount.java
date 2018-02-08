package bankingSystem;

public class LoanAccount extends BankingSystem{
	
	LoanAccount(String name,float depositBalance,float rateOfInterest){
		super(name, Account.LOAN.value, depositBalance, rateOfInterest);
	}

	@Override
	public Boolean withdraw(float money) {
		System.out.println("Withdrawal is not applicable");
		return Boolean.FALSE;
	}
	
	@Override
	public Boolean deposit(float money) {
		if(money > 0 & this.getBalance() != 0 & ( Float.compare(this.getBalance(), money) >= 0)){
			this.setBalance(this.getBalance()- money);
			return true;
		}
		return false;
	}
}
