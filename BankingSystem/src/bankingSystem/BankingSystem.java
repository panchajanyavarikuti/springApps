package bankingSystem;

import java.util.Random;

public abstract class BankingSystem implements BankingInterface{

	private String name,accountId;
	private float balance,interestRate;
	private String accountType;
	private int numberOfWidthdrawls;
	
	BankingSystem(String name,String accountType, float balance, float interestRate){
		this.name = name;
		this.balance = balance;
		this.interestRate = interestRate;
		this.accountType = accountType;
		
		Random rd = new Random();
		String accId = String.format(AccountFormat, rd.nextInt(100000 - 0)+1);
		this.accountId = accId;
	}
	
	public void resetWidthdrawlsCount(){
		this.setNumberOfWidthdrawls(5);
	}
	
	@Override
	public float displayBalance() {
		return this.balance;
	}

	@Override
	public Boolean deposit(float money) {
		if(money > 0){
			this.balance += money;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountId() {
		return accountId;
	}

	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public String getAccountType() {
		return accountType;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getNumberOfWidthdrawls() {
		return numberOfWidthdrawls;
	}

	public void setNumberOfWidthdrawls(int numberOfWidthdrawls) {
		this.numberOfWidthdrawls = numberOfWidthdrawls;
	}

	@Override
	public String toString() {
		return "[Customer Name=" + name + ", A/C Id=" + accountId + ", Available Balance=" + balance + " rupees, Rate of Interest="
				+ interestRate + ", Account=" + accountType + ", permissiable Widthdrawls for month= " + (numberOfWidthdrawls == 0 ? "NA" : numberOfWidthdrawls)+ "]";
	}
	
}
