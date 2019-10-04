// CREATED BY 'DK'
// DATE 13-07-2019

import java.util.Scanner;

class Menudriven
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first complex number:");
		int x1 = s.nextInt(); int y1 = s.nextInt();
		System.out.println("Enter first complex number:");
		int x2 = s.nextInt(); int y2 = s.nextInt();

		System.out.println("\n1. Addition\n2. Subtraction\n3. Multiplication");
		System.out.print("  Enter a choice: ");
		int c = s.nextInt();
		switch(c)
		{
			case 1:
				System.out.println("SOLUTION: " + (x1+x2) + "+" + (y1+y2) + "i");
				break;
			case 2:
				System.out.println("SOLUTION: " + (x1-x2) + "+" + (y1-y2) + "i");
				break;
			case 3:
				System.out.println("SOLUTION: " + (x1*x2) + "+" + (y1*y2) + "i");
				break;
			default:
				System.out.println("Wrong input");
				break;
		}

	}
}