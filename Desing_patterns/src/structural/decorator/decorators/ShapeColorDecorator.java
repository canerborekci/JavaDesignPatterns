package structural.decorator.decorators;

import structural.decorator.models.Shape;

public class ShapeColorDecorator extends ShapeDecorator{

	public ShapeColorDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		shape.draw();
		setColorToRed();
	}
	
	private void setColorToRed() {
		// shape.color = red;
		
		System.out.println("Shape color is red now ");
	}
}
