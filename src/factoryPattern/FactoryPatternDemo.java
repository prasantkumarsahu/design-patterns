package factoryPattern;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}
}
