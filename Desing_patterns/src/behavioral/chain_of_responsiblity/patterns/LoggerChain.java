package behavioral.chain_of_responsiblity.patterns;

import behavioral.chain_of_responsiblity.logging.AbstractLogger;
import behavioral.chain_of_responsiblity.logging.ConsoleLogger;
import behavioral.chain_of_responsiblity.logging.DatabaseLogger;
import behavioral.chain_of_responsiblity.logging.FileLogger;

public class LoggerChain {
	public static AbstractLogger getChainOfLoggers(){
		// db, file, console
		
		
		AbstractLogger databaLogger = new DatabaseLogger();
		AbstractLogger fileLogger = new FileLogger();
		AbstractLogger consoleLogger = new ConsoleLogger();
		
		
		databaLogger.nextLogger = fileLogger;
		fileLogger.nextLogger = consoleLogger;
		
		return databaLogger;
	}
}
