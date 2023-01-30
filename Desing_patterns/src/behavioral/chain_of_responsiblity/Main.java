package behavioral.chain_of_responsiblity;

import behavioral.chain_of_responsiblity.logging.AbstractLogger;
import behavioral.chain_of_responsiblity.patterns.LoggerChain;

public class Main {

	public static void main(String[] args) {
		AbstractLogger logger = LoggerChain.getChainOfLoggers();
		logger.logMessage("Merhaba..!");
	}

}
