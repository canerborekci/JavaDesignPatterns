package creational.factory.caching;

public class LoremCacher implements ICaching{
	
	@Override
	public void cache() {
		System.out.println("Lorem cachelendi");
	}

}
