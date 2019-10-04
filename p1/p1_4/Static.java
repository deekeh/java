// CREATED BY 'DK'
// DATE 13-07-2019

import java.util.Scanner;

class Static
{
	Static()
	{
		incr();
	}

	static int x;
	static void incr()
	{
		x++;
	}

	public static void main(String[] args) {
		Static a = new Static();
		Static b = new Static();
		Static c = new Static();
		
		System.out.println("Number of objects: " + x);
	}
}