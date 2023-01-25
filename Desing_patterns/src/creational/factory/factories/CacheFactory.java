package creational.factory.factories;

import creational.factory.caching.ICaching;
import creational.factory.caching.LoremCacher;

public class CacheFactory {
	public ICaching createCacher() {
		return new LoremCacher();
	}

}
