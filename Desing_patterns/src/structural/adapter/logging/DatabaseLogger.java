package structural.adapter.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log() {
		System.out.println("database loglandý");
		
	}

}
