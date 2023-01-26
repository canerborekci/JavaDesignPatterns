package structural.flyweight;

public class Circle implements Shape{



	private String color;
	private int x;
	private int y;
	
	

	@Override
	public void draw() {
		System.out.println("ekran�n " + x + ", " + y + " koordinat�na " + color + " renginde bir circle �izildi");
		
	}
	
	public Circle(String color) {
		this.color = color;
	}




	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}
	
	

}
