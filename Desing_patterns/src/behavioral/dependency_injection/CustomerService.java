package behavioral.dependency_injection;

public class CustomerService implements ICustomerService{
	private ILogger logger;
		

	public CustomerService(ILogger logger) {
		this.logger = logger;
	}


	@Override
	public void add() {
			System.out.println("Customer added");
			logger.log();
	}

}
