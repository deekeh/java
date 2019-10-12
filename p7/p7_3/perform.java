class Producer extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Producing the product...");
			// sleep(1000);
			System.out.println("Finished Production...");
			// sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Consumer extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Purchasing the product...");
			// sleep(1000);
			System.out.println("Finished Purchase...");
			// sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class Perform
{
	public static void main(String args[])
	{
		Producer p = new Producer();
		Consumer c = new Consumer();
		for(int i = 0; i<5; i++)
		{
			p.run();
			c.run();
		}
		
	}
}