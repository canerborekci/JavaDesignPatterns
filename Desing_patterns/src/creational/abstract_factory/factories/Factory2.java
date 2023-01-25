package creational.abstract_factory.factories;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.caching.InMemoryCaching;
import creational.abstract_factory.logging.Logging;
import creational.abstract_factory.logging.MySqlLogging;

public class Factory2 extends CrossCuttingConcernFactory{

	@Override
	public Caching createCaching() {
		return new InMemoryCaching();
	}

	@Override
	public Logging createLogging() {
		return new MySqlLogging();
	}
	

}
