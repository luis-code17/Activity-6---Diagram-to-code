package activity6;

public class Check extends Payment{
	private String name;
	private String bankID;
	public Check(float amount, String name, String bankID) {
		super(amount);
		this.setName(name);
		this.setBankID(bankID);
	}
	
	public String getBankID() {
		return bankID;
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void authorized() {
		
	}
}
