package behavioral.chain_of_responsiblity.logging;

public class FileLogger  extends AbstractLogger{

	@Override
	void log(String message) {
		System.out.println("file'a loglandý");			
	}

}
