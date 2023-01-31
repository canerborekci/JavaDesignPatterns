package behavioral.visitor;

public class ComputerPartGamerVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Bilgisayar gaming bilgisayara y�kseltildi");
	}

	@Override
	public void visit(Keyboard keyboard) {
		keyboard.isRgb = true;
		System.out.println("Klavye rgb �zelli�i kazand�r�ld�");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("monitor 144hz y�kseltildi");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("gaming mouse'a y�kseltildi");
		
	}

}
