// CREATED BY 'DK'
// DATE 04-08-2019

import java.util.Scanner;
abstract class Queue
{
	int queue_length = 10;
	int queue_end_position = 0, queue_front_position = 0;
	int q[] = new int[queue_length];
	abstract boolean enqueue();
	abstract boolean dequeue();
	abstract void check_and_execute(boolean add);
	abstract void displayAll();
}
class Perform extends Queue
{
	boolean enqueue()
	{
		if (queue_end_position != queue_length)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a number to be inserted:");
			q[queue_end_position] = s.nextInt();
			queue_end_position ++;
			return true;
		}
		return false;
	}
	boolean dequeue()
	{
		if (queue_front_position != queue_end_position)
		{
			queue_front_position ++;
			return true;
		}
		return false;
	}
	void check_and_execute(boolean add)
	{
		if (add)
		{
			if (enqueue()) System.out.println(" - ENQUEUE operation successful");
			else System.out.println(" * ENQUEUE operation unsuccessful / Queue is full");
		}
		else if (!add)
		{
			if (dequeue()) System.out.println(" - DEQUEUE operation successful");
			else System.out.println(" * DEQUEUE operation unsuccessful / Queue is empty");
		}
	}
	void displayAll()
	{
		if (queue_end_position == 0)
		{
			System.out.println("Empty queue");
			return;
		}
		System.out.println("Elements of Queue:");
		for (int e=queue_front_position; e<queue_length; e++)
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
			System.out.println("\n1. Enqueue\n2. Dequeue\n3. Display content\n4. Exit");
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