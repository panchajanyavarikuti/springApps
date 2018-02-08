package bankingSystem;

public class Main {

	public static void main(String[] args) {
		BankingSystem account = new LoanAccount("LoanAccount", 100.0f, 1f);
		performOperations(account);
		account = new SavingsAccount("SavingsAccount", 10.0f, 1f);
		performOperations(account);
		account = new CurrentAccount("CurrentAccount", 10.0f, 1f);
		performOperations(account);
	}

	private static void performOperations(BankingSystem account) {
		printDetails(account);
		System.out.println("Is money deposited: "+ account.deposit(30f));
		System.out.println("Is money withdrawn: "+account.withdraw(10f));
		getBalanceDetails(account);
	}

	private static void printDetails(BankingSystem account) {
		System.out.println("\n"+account.getAccountType()+" transactions\n"+account);
	}

	private static void getBalanceDetails(BankingSystem account) {
		System.out.println("Account ID: "+account.getAccountId()+", Balance "+account.displayBalance());
	}
}
