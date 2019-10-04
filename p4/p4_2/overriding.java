// CREATED BY 'DK'
// DATE 13-08-2019

import java.util.Scanner;
class Student
{
	int id, age, grade;
	String name, address;
	Scanner s = new Scanner(System.in);
	void getDetails()
	{
		System.out.println("Enter id:");
		id = s.nextInt();
		System.out.println("Enter Name:");
		name = s.nextLine();
		name = s.nextLine();
		System.out.println("Enter Age:");
		age = s.nextInt();
		System.out.println("Enter Address:");
		address = s.nextLine();
		address = s.nextLine();
		System.out.println("Enter Grade:");
		grade = s.nextInt();
		System.out.println("");
	}
	boolean isPassed(){return true;}	// function is over-ridden by children
}
class Graduate extends Student
{
	boolean isPassed(int g)	// over-ridden
	{
		if (g >=70) return true;
		return false;
	}
}
class UnderGraduate extends Student
{
	boolean isPassed(int g)	// over-ridden
	{
		if (g >= 80) return true;
		return false;
	}
}
class Perform
{

	public static void main(String[] args) {
		int choice;
		System.out.println("\n  1. Graduate\n  2. Under-Graduate\n  *. Exit");
		Scanner x = new Scanner(System.in);
		choice = x.nextInt();
		switch (choice)
		{
			case 1:
			Graduate g = new Graduate();
			g.getDetails();
			if (g.isPassed(g.grade))
			{
				System.out.println("CONGRATULATIONS! You have passed.");
				break;
			}
			System.out.println("You have failed.");
			break;
			case 2:
			UnderGraduate ug = new UnderGraduate();
			ug.getDetails();
			if (ug.isPassed(ug.grade))
			{
				System.out.println("CONGRATULATIONS! You have passed.");
				break;
			}
			System.out.println("You have failed.");
			break;
			default:
			System.out.println("End of session");
		}
	}
}