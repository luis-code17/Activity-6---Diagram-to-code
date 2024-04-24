package activity6;

import java.util.Date;

public class Credit extends Payment {
	private String type;
	private String number;
	private Date expDate;
	
	public Credit(float amount, String type, String number, Date expDate) {
		super(amount);
		this.type=type;
		this.number=number;
		this.expDate=expDate;
	}
	
	public Date getExpDate() {
		return expDate;
	}
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void authorized() {
		
	}
	

}
