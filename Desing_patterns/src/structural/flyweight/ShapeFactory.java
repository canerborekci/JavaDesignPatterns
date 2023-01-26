package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	 private static HashMap circles = new HashMap();
	
	public static Circle getCircle(String color) {
        Circle circle = (Circle) circles.get(color);
		if(circle == null) {
			System.out.println("newlenme i�lemi yap�ld�");
            circle = new Circle(color);
            circles.put(color,circle);
		}

		return circle;
	}

}
