package structural.bridge;

import structural.bridge.message_senders.EmailSender;
import structural.bridge.message_senders.SmsSender;
import structural.bridge.services.CustomerService;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerService();
		customerService.messageSenderBase = new EmailSender();
		customerService.verify();
		
		customerService.messageSenderBase = new SmsSender();
		customerService.verify();

	}

}
