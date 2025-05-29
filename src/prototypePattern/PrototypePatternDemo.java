package prototypePattern;

public class PrototypePatternDemo {

	public static void main(String[] args) {

		ShapeCache.loadCache();

		Shape clonedShape1 = ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape1.type);

		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.type);

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.type);
	}
}
