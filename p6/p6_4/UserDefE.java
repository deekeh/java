import java.util.Scanner;

class PayOutOfBounds extends Exception
{
	PayOutOfBounds(String exc)
	{
		super(exc);
	}
}

class Bank
{
	int bal=0;
	boolean open() throws PayOutOfBounds
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = s.nextLine();
		System.out.println("Enter initial balance");
		bal = s.nextInt();
		if (bal < 500) throw new PayOutOfBounds("Initial deposit should be > 500");
		else return true;
		// return false;
	}
	int deposit() throws PayOutOfBounds
	{
		System.out.println("Enter amount to be deposited:");
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		if (d <= 0) throw new PayOutOfBounds("Deposit amount Invalid");
		else return d;
		// return 0;
	}
	int withdraw() throws PayOutOfBounds
	{
		System.out.println("Enter the amount to be withdrawn:");
		Scanner s = new Scanner(System.in);
		int w = s.nextInt();
		if (w > bal) throw new PayOutOfBounds("Withdraw amount Invalid");
		else
		{
			bal -= w;
			return w;
		}
		// return 0;
	}
	public static void main(String[] args) {
		try
		{
			System.out.println("\tWelcome to the Bank of DK\n\n");
			Bank b = new Bank();
			if (b.open()) {
				System.out.println("Deposited amount: " + b.deposit());
				System.out.println("Withdrawn amount: " + b.withdraw());
			}
		}
		catch(PayOutOfBounds pe)
		{
			System.out.println(pe);
		}
		finally
		{
			System.out.println("\n\n!!  Program terminated successfully  !!");
		}
	}
}