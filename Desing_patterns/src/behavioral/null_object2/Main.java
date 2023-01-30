package behavioral.null_object2;

import behavioral.null_object2.models.Customer;
import behavioral.null_object2.repositories.CustomerRepository;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = CustomerRepository.getCustomer("Halit");
		Customer customer2 = CustomerRepository.getCustomer("Ulas");
		Customer customer3 = CustomerRepository.getCustomer("deneme");
		
		
		// her yerde check yapacaðýmýza
		if(customer1 != null) {
			System.out.println(customer1.getName());	
		}
		
		if(customer2 != null) {
			System.out.println(customer1.getName());	
		}
		
		if(customer3 != null) {
			System.out.println(customer1.getName());	
		}
		
		//artýk repositoryde kontrol ediliyor 
		System.out.println(customer1.getName());	
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
	}

}
