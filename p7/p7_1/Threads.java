class Even extends Thread
{
	public void run()
	{
		for (int i=0; i<=100; i++)
			if (i%2 == 0)
				System.out.println("Even number: " + i);
	}
}
class Prime extends Thread
{
	public void run()
	{
		for (int i=2; i<=100; i++)
		{
			boolean isPrime = true;
			for (int k=2; k<=i/2; k++)
			{
				if (i%k == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) System.out.println("Prime number: " + i);
		}
	}
}
class Fibonacci extends Thread
{
	public void run()
	{
		int first = 1, last = 1;
		System.out.println("Fibonacci series: " + first);
		// System.out.println("Fibonacci series: " + last);
		
		int t = first;
		while (last <= 100)
		{
			System.out.println("Fibonacci series: " + last);
			t = first + last;
			first = last;
			last = t;
		}
	}
}
class Threads
{
	public static void main(String[] args) {
		Even e = new Even();
		Prime p = new Prime();
		Fibonacci f = new Fibonacci();
		e.start();
		p.start();
		f.start();
	}
}