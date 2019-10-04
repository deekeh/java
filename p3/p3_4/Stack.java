// CREATED BY 'DK'
// DATE 04-08-2019

import java.util.Scanner;
abstract class Stack
{
	int stack_length = 10;
	int stack_end_position = 0;
	int q[] = new int[stack_length];
	abstract boolean push();
	abstract boolean pop();
	abstract void check_and_execute(boolean add);
	abstract void displayAll();
}
class Perform extends Stack
{
	boolean push()
	{
		if (stack_end_position != stack_length)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number to be inserted:");
			q[stack_end_position] = s.nextInt();
			stack_end_position ++;
			return true;
		}
		return false;
	}
	boolean pop()
	{
		if (stack_end_position != 0)
		{
			stack_end_position --;
			return true;
		}
		return false;
	}
	void check_and_execute(boolean add)
	{
		if (add)
		{
			if (push()) System.out.println(" - PUSH operation successful");
			else System.out.println(" * PUSH operation unsuccessful / Stack is full");
		}
		else if (!add)
		{
			if (pop()) System.out.println(" - POP operation successful");
			else System.out.println(" * POP operation unsuccessful / Stack is empty");
		}
	}
	void displayAll()
	{
		if (stack_end_position == 0)
		{
			System.out.println("Empty stack");
			return;
		}
		System.out.println("Elements of Stack:");
		for (int e=0; e<stack_end_position; e++)
			if (q[e] != 0)
				System.out.println(q[e]);
	}

	public static void main(String[] args)
	{
		Perform a = new Perform();
		Scanner n = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("\n1. Push\n2. Pop\n3. Display content\n4. Exit");
			choice = n.nextInt();
			switch (choice)
			{
				case 1:
				a.check_and_execute(true);
				break;
				case 2:
				a.check_and_execute(false);
				break;
				case 3:
				a.displayAll();
				case 4:
				break;
				default:
				System.out.println("Wrong choice");
			}
		} while (choice != 4);
	}
}