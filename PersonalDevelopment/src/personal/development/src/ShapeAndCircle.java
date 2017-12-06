package personal.development.src;

public class ShapeAndCircle {

	public static void main(String a[]) throws Exception {
		Circle c = new Circle();
	}

}

abstract class Shape {
	public Shape()
	{
		System.out.println("Shape Constructor");
		calc();
	}

	public abstract void calc();
}

class Circle extends Shape 
{
	private Integer i;

	public Circle() {
		i = new Integer(10);
	}

	@Override
	public void calc()
	{
		System.out.println("Circle Calc"+i.toString());
	}
}
