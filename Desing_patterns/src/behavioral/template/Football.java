package behavioral.template;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("Football initialized");
	}

	@Override
	void start() {
		System.out.println("Football started");		
	}

	@Override
	void end() {
		System.out.println("Football ended");		
	}

}
