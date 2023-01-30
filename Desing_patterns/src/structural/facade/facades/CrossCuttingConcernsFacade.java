package structural.facade.facades;

import structural.facade.authorization.Authorization;
import structural.facade.authorization.IAuthorization;
import structural.facade.caching.ICaching;
import structural.facade.caching.RedicCaching;
import structural.facade.logging.DatabaseLogger;
import structural.facade.logging.ILogger;

public class CrossCuttingConcernsFacade {
	public ILogger logger;
	public IAuthorization authorization;
	public ICaching caching;
	
	public CrossCuttingConcernsFacade() {

	       this.logger = new DatabaseLogger();
	        this.caching = new RedicCaching();
	        this.authorization = new Authorization();
	}

}
