package behavioral.state;

public class EndState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("medya çalar durduruluyor");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "End State";
	}

}
