// CREATED BY 'DK'
// DATE 20-07-2019

import java.util.Scanner;

class Palindromex
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.nextLine();

		boolean isPalindrome = true;
		for (int i=0; i<s.length()/2; i++) {
			if (s.toLowerCase().charAt(i) == s.toLowerCase().charAt(s.length()-1-i)) continue;
			isPalindrome = false;
			break;
		}

		if (isPalindrome) System.out.println("\n\"" + s + "\"" + " is a palindrome.");
		else System.out.println("\n\"" + s + "\"" + " is not a palindrome.");
	}
}