package behavioral.chain_of_responsiblity.logging;

public class DatabaseLogger extends AbstractLogger{

	@Override
	void log(String message) {
		System.out.println("Database Loglandý");
	}
	

}
