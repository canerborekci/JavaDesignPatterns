package behavioral.visitor;

public class ComputerPartGamerVisitor implements ComputerPartVisitor {

	@Override
	public void visit(Computer computer) {
		System.out.println("Bilgisayar gaming bilgisayara yükseltildi");
	}

	@Override
	public void visit(Keyboard keyboard) {
		keyboard.isRgb = true;
		System.out.println("Klavye rgb özelliði kazandýrýldý");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("monitor 144hz yükseltildi");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("gaming mouse'a yükseltildi");
		
	}

}
