package bridgePattern;

public class Circle extends Shape{

	private final int x;
	private final int y;
	private final int radius;

	public Circle(DrawAPI drawAPI, int x, int y, int radius) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}
