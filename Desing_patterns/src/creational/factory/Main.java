package creational.factory;

import creational.factory.caching.ICaching;
import creational.factory.factories.CacheFactory;


public class Main {

	public static void main(String[] args) {
        CacheFactory factory = new CacheFactory();

        ICaching cacher = factory.createCacher();
        cacher.cache();
        
        ICaching cacher2 = factory.createCacher();
        cacher2.cache();
        
        ICaching cacher3 = factory.createCacher();
        cacher3.cache();
        
        ICaching cacher4 = factory.createCacher();
        cacher4.cache();
        
        ICaching cacher5 = factory.createCacher();
        cacher5.cache();


	}

}
