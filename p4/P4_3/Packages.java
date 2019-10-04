// CREATED BY 'DK'
// DATE 13-08-2019

import Calculation.MathOperation;

class Perform
{
	public static void main(String[] args) {
		int a = 69, b = 3;
		MathOperation c = new MathOperation();
		System.out.println(a + " + " + b + " = " + c.addx(a,b));
		System.out.println(a + " - " + b + " = " + c.subtractx(a,b));
		System.out.println(a + " * " + b + " = " + c.multiplyx(a,b));
		System.out.println(a + " / " + b + " = " + c.dividex(a,b));
	}
}