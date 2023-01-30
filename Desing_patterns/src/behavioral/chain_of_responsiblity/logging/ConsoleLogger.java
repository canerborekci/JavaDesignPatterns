package behavioral.chain_of_responsiblity.logging;

public class ConsoleLogger extends AbstractLogger {

	@Override
	void log(String message) {
		System.out.println("konsola loglandý");
	}
	
	

}
