package behavioral.chain_of_responsiblity.logging;

public abstract class AbstractLogger {
	
	public AbstractLogger nextLogger;
	
	//Chain
	
	public void logMessage (String message) {
		log(message);
		
		
		//chain control
		//Zincirin son halkasýnda mýyým
		if(nextLogger != null) {
			nextLogger.logMessage(message);
		}
	}
	
	
	abstract void log(String message);
}
