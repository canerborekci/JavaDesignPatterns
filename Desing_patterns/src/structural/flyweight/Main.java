package structural.flyweight;

public class Main {
	private static final String colors[] = { "K?rm?z?", "Ye?il", "Mavi", "Beyaz"};
	
	public static void main(String[] args) {
			for(int i = 0; i<200 ; i++) {
				Circle circle = ShapeFactory.getCircle(getRandomColor());
				circle.setX(getRandomCoordinate());
				circle.setY(getRandomCoordinate());
				circle.draw();
				
			}
		
		

	}
	
	private static String getRandomColor() {
		return colors[(int)(Math.random() * colors.length)];
		
	}
	
	private static int getRandomCoordinate() {
		return (int) (Math.random() * 1000);
	}

}
