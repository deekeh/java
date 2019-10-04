class Exc
{
	void arrayExc() throws Exception
	{
		int x[] = new int[-1];
		int y = 69/0;
	}
	public static void main(String[] args) {
		Exc e = new Exc();
		try
		{
			e.arrayExc();
		}
		catch(Exception ex)
		{
			System.out.println("EXCEPTION CAUGHT: " + ex);
		}
	}
}