class NFE
{
	public static void main(String[] args) {
		try
		{
			System.out.println("Name: " + Integer.parseInt(args[0]));
			System.out.println("Roll number: " + args[1]);
			System.out.println("Marks: " + args[2]);
			System.out.println("Subject: " + args[3]);
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Caught Exception: " + nfe + "\n\n");
		}
		finally
		{
			int marks = Integer.parseInt(args[2]);
			int pc = marks*100/80;
			System.out.println("Percentage: " + pc + "%");
		}
	}
}