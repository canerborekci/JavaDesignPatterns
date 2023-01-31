package behavioral.dependency_injection;

public class Main {
		public static void main(String[] args) {
			ICustomerService customerService = new CustomerService(new DatabaseLogger());
			customerService.add();
			
			
			ICustomerService customerService1 = new CustomerService(new FileLogger());
			customerService1.add();
		}
}
