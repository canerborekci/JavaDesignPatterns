package creational.factory.caching;

public class CoherenceCacher implements ICaching{

	@Override
	public void cache() {
		System.out.println("Coherence cachelendi");
	}

}
