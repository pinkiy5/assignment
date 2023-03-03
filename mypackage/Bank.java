package mypackage;

public class Bank {
	private long accnt_no;
	private String name,email;
	private float amount;
	public long getAccnt_no() {
		return accnt_no;
	}
	public void setAccnt_no(long accnt_no) {
		this.accnt_no = accnt_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}

}
