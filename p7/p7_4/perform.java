class A extends Thread {
	public void run() {
		try {
			System.out.println("Thread A is running...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class B extends Thread {
	public void run() {
		try {
			System.out.println("Thread B is running...");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
class C extends Thread {
	public void run() {
		try {
			System.out.println("Thread C is running...");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
class Perform {
	public static void main(String[] args) {
		try {
			A a = new A();
			B b = new B();
			C c = new C();
			a.start();
			a.join();
			b.start();
			b.join();
			c.start();
			c.join();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}