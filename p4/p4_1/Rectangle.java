import java.util.Scanner;
public class Rectangle extends Shape
{
	double area ()
	{
		System.out.println("Enter two parameters of the rectangle:");
		int l, b, h;
		l = s.nextDouble();
		b = s.nextDouble();
		h = s.nextDouble();
		return (l*b*h);
	}
	// public static void main(String[] args) {
		
	// }
}