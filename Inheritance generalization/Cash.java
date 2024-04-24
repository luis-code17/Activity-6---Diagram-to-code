package activity6;

public class Cash extends Payment {

	private float cashTendred;

	public Cash(float amount, float cashTendred) {
		super(amount);
		this.cashTendred=cashTendred;
	}

	public float getCashTendred() {
		return cashTendred;
	}

	public void setCashTendred(float cashTendred) {
		this.cashTendred = cashTendred;
	}

}
