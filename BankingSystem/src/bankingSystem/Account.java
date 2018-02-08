package bankingSystem;

public enum Account {
	SAVINGS("Savings Account"),
	CURRENT("Current Account"),
	LOAN("Loan Account"),
	FIXED_DEPOSIT("Fixed Deposit");

	String value;
	Account(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return this.value;
	}
}
