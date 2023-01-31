package behavioral.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("medya �alar ba�lat�l�yor");
		context.setState(this);
	}
	
	@Override
	public String toString() {
		return "Start State";
	}

}
