package behavioral.mediator;

public class Main {

	public static void main(String[] args) {
		User user = new User("caner");
		User user1 = new User("ulas");
		
		user.sendMessage(user1, "selam�naleyk�m");
		user1.sendMessage(user, "aleyk�mselam");

	}

}
