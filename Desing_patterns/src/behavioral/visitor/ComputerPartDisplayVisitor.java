package behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("computer nesnesi visit edildi");
	}

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("keyboard nesnesi visit edildi");
		
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("monitor nesnesi visit edildi");
		
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("mouse nesnesi visit edildi");
		
	}

}
