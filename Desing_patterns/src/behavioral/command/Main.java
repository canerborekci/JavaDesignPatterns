package behavioral.command;

public class Main {
	public static void main(String[] args) {
		Coin coin = new Coin();
		
		coin.name = "BTC";
		
		SellCoinCommand sellCommand = new SellCoinCommand(coin);
		
		BuyCoinCommand buyCommand = new BuyCoinCommand(coin);
		
		
		
		sellCommand.execute();
		buyCommand.execute();
		
		
		Broker broker = new Broker();
		broker.addCommand(buyCommand);
		broker.addCommand(sellCommand);
		broker.executeAll();
	}
	

}
