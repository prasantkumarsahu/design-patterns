package abstractFactoryPattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args) {
		AbstractFactory roundedFactory = FactoryProducer.getFactory(true);
		Shape roundedRectangle = roundedFactory.getShape("rectangle");
		roundedRectangle.draw();

		Shape roundedSquare = roundedFactory.getShape("square");
		roundedSquare.draw();

		AbstractFactory factory = FactoryProducer.getFactory(false);
		Shape rectangle = factory.getShape("rectangle");
		rectangle.draw();

		Shape square = factory.getShape("square");
		square.draw();
	}
}
