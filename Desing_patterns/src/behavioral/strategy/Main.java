package behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		Context context1 = new Context(new OperationAdd());
		
		System.out.println(context1.executeStrategy(5, 10));
		
		System.out.println("**********************");
		
		
		Context context2 = new Context(new OperationMultiply());
		
		System.out.println(context2.executeStrategy(5, 10));
		
		System.out.println("**********************");
		
		Context context3 = new Context(new OperationDivide());
		
		System.out.println(context3.executeStrategy(5, 10));
		
		System.out.println("**********************");
		
		Context context4 = new Context(new OperationSubstract());
		
		System.out.println(context4.executeStrategy(5, 10));
		
		

	}

}
