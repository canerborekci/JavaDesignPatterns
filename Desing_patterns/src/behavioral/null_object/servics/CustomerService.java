package behavioral.null_object.servics;

import behavioral.null_object.loggers.ILogger;

public class CustomerService implements ICustomerService{
	public CustomerService(ILogger logger) {
		this.logger = logger;
	}

	private ILogger logger;

	@Override
	public void add() {
		
		if(logger!=null) {
			logger.log();
		}
		System.out.println("Customer Eklendi");
		
	}

}
