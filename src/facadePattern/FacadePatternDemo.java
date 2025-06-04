package facadePattern;

public class FacadePatternDemo {
	public static void main(String[] args) {

		ShapeMaker sp = new ShapeMaker();

		sp.drawCircle();
		sp.drawRectangle();
		sp.drawSquare();
	}
}
