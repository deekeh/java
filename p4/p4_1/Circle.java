public class Circle extends Shape
{
	double area ()
	{
		return (r*r*3.141592653);
	}
	public static void main(String[] args) {
		System.out.println("Area of circle: " + new Circle.area());
	}
}