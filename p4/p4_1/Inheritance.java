// CREATED BY 'DK'
// DATE 26-08-2019

import java.util.Scanner;

abstract class Shape
{
	Scanner s = new Scanner(System.in);
	abstract double area ();
}

class Rectangle extends Shape
{
	double area ()
	{
		System.out.println("Enter the length and the breadth of the rectangle:");
		double l, b;
		l = s.nextDouble();
		b = s.nextDouble();
		return (l*b);
	}
}

class Square extends Shape
{
	double area ()
	{
		System.out.println("Enter the side of the square:");
		double l;
		l = s.nextDouble();
		return (l*l);
	}
}

class Triangle extends Shape
{
	double area ()
	{
		System.out.println("Enter the base and the height of the triangle:");
		double b, h;
		b = s.nextDouble();
		h = s.nextDouble();
		return (0.5*b*h);
	}
}

class Circle extends Shape
{
	double area ()
	{
		System.out.println("Enter the side of the circle:");
		double r;
		r = s.nextDouble();
		return (3.141592653*r*r);
	}
}

class Ellipse extends Shape
{
	double area ()
	{
		System.out.println("Enter the semi-major and semi-minor axes of the ellipse:");
		double a, b;
		a = s.nextDouble();
		b = s.nextDouble();
		return (3.141592653*a*b);
	}
}

class Perform
{
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		System.out.println("Area of rectangle: " + r.area());
		Square sq = new Square();
		System.out.println("Area of square: " + sq.area());
		Triangle t = new Triangle();
		System.out.println("Area of triangle: " + t.area());
		Circle c = new Circle();
		System.out.println("Area of circle: " + c.area());
		Ellipse e = new Ellipse();
		System.out.println("Area of ellipse: " + e.area());
	}
}
