package behavioral.null_object2.models;

public class NullCustomer extends Customer{

	@Override
	public String getName() {
		return "Böyle bir kullanýcý yok";
	}

	@Override
	public boolean isNull() {
		return true;
	}

}
