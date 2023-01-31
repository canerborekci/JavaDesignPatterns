package behavioral.template;

public class Basketball extends Game{
	@Override
	void initialize() {
		System.out.println("Basketball initialized");
	}

	@Override
	void start() {
		System.out.println("Basketball started");		
	}

	@Override
	void end() {
		System.out.println("Basketball ended");		
	}

}
