package structural.proxy.services;

public class ExampleService implements IExampleService{
	
	//servise tekrardan gelindi�inde daha �nce gelinmi�se yeni bir i�lem ba�latmamak i�in bu design pattern kullan�l�r.

	@Override
	public int getData(int number) {
		//Sim�lasyon: s�re alan bir i�lem
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
