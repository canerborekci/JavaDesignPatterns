package creational.abstract_factory;

import creational.abstract_factory.factories.Factory1;
import creational.abstract_factory.factories.Factory2;
import creational.abstract_factory.services.IProdService;
import creational.abstract_factory.services.ProdService;


public class Main {

	public static void main(String[] args) {
		 IProdService prodService = new ProdService(new Factory1());
		 prodService.add();

	        System.out.println("****************");


			IProdService prodService2 = new ProdService(new Factory2());
			prodService2.add();
	}

}
