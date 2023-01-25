package creational.prototype;

public class Main {

	public static void main(String[] args) {
		Cust customer1 = new Cust();
		customer1.custNo = "123123";
		customer1.corpName = "Etiya";
		customer1.taxId = 123123;
		
		
		Cust cust2 = (Cust) customer1.clone();
		System.out.println(cust2.corpName);
	}
	
	
	

}
