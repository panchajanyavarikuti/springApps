package bankingSystem;

public interface BankingInterface {
	
	String AccountFormat = "%011d";

	public Boolean withdraw(float money);
	
	public float displayBalance();
	
	public Boolean deposit(float money);
	
}
