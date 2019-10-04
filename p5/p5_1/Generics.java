class Generics <E>
{
	E x;
	E y;

	Generics(E x, E y)
	{
		this.x = x;
		this.y = y;
	}

	void p()
	{
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		Generics<Integer> g = new Generics<>(1, 2);
		g.p();
	}
}