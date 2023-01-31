package behavioral.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("medya çalar baþlatýlýyor");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "Start State";
	}

}
