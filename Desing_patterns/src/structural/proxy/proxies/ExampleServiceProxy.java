package structural.proxy.proxies;

import java.util.HashMap;

import structural.proxy.services.ExampleService;
import structural.proxy.services.IExampleService;

public class ExampleServiceProxy implements IExampleService{
	private IExampleService exampleService;
	private HashMap<Integer, Integer>  storedDatas = new HashMap<>();
	
	
	public ExampleServiceProxy() {
		this.exampleService = new ExampleService();
	}


	@Override
	public int getData(int number) {
		if(!storedDatas.containsKey(number)) {
			int result = exampleService.getData(number);
			storedDatas.put(number, result);
		}
		return storedDatas.get(number);
	}
	

}
