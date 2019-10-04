// CREATED BY 'DK'
// DATE 13-07-2019

import java.util.Scanner;

class Prime
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the range to search for prime numbers:");
		int x = s.nextInt();
		System.out.println("\nPrime numbers are:");

		for (int y=2; y<=x; y++) {
			boolean prime = true;
			for (int i=2; i<=y/2; i++) {
				if (y%i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) System.out.println(y);
		}
	}
}