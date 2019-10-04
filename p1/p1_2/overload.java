// CREATED BY 'DK'
// DATE __-07-2019

import java.util.Scanner;
import java.lang.Math;

class overload
{
	int area(int l, int b)
	{
		return l*b;
	}

	double area(double r)
	{
		return 3.14 * r * r;
	}

	double area(double a, double b, double c)
	{
		double s = (a+b+c)/2;
		return Math.sqrt((s)*(s-a)*(s-b)*(s-c));
	}

	public static void main(String[] args) {
		overload o = new overload();
		System.out.println("Area of rectangle: " + o.area(5,4));
		System.out.println("Area of circle: " + o.area(5.0));
		System.out.println("Area of triangle: " + o.area(5, 5, 5));
	}
};