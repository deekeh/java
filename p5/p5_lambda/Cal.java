interface C
{
	double calculate(int x, int y);
}
class Cal
{
	public static void main(String[] args) {
		C perf;
		perf = (int x, int y) -> {return (x + y);};
		System.out.println("Addition: " + perf.calculate(10,69));
		perf = (int x, int y) -> {return (x - y);};
		System.out.println("Subtraction: " + perf.calculate(69,10));
		perf = (int x, int y) -> {return (x * y);};
		System.out.println("Multiplication: " + perf.calculate(69,10));
		perf = (int x, int y) -> {return (x / y);};
		System.out.println("Division: " + perf.calculate(8,2));
	}
}