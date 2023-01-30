package structural.proxy.services;

public class ExampleService implements IExampleService{
	
	//servise tekrardan gelindiðinde daha önce gelinmiþse yeni bir iþlem baþlatmamak için bu design pattern kullanýlýr.

	@Override
	public int getData(int number) {
		//Simülasyon: süre alan bir iþlem
		int total = 0;
		
		for (int i = 0 ; i < number; i++) {
			total += i;
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		return total;
	}
	

}
