class MultipleExc
{
	public static void main(String[] args) {
		try
		{
			// MultipleExc m = new MultipleExc();
			// m.calculate();
			int x = Integer.parseInt(args[0]), y = Integer.parseInt(args[1]);
			System.out.println("Addition: " + (x+y));
			System.out.println("Subtraction: " + (x-y));
			System.out.println("Multiplication: " + (x*y));
			try
			{
				System.out.println("Division: " + (x/y));
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Division by 0: " + ae + "\n");
			}
		}
		catch(IndexOutOfBoundsException ie)
		{
			System.out.println("Exception with Improper arguments: " + ie + "\n");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division by 0: " + ae + "\n");
		}
		finally
		{
			System.out.println("Calculator program has ended successfully");
		}
	}
}