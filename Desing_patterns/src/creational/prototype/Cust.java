package creational.prototype;

public class Cust extends Org {
	public String custNo;
	
	public Cust() {
		
	}
	
	public Cust(Cust customer) {
		super(customer);
		custNo = customer.custNo;
	}

	@Override
	public Org clone() {
		return new Cust(this);
	}
}
