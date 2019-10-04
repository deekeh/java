// CREATED BY 'DK'
// DATE 20-07-2019

import java.util.Scanner;

class Vowel
{
	boolean isLetter(char c)
	{
		int charAscii = (int)(c);
		if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) return true;
		return false;
	}

	public static void main(String[] args) {
		int consonants = 0, vowels = 0;
		Vowel v = new Vowel();
		String s = "Vivekanand Education Society's Inititute of Technology.";
		for (int i=0; i<s.length(); i++) {
			if (v.isLetter(s.charAt(i))) {
				if (s.toLowerCase().charAt(i) == 'a' || s.toLowerCase().charAt(i) == 'e' || s.toLowerCase().charAt(i) == 'i' || s.toLowerCase().charAt(i) == 'o' || s.toLowerCase().charAt(i) == 'u') vowels++;
				else consonants++;
			}
		}

		System.out.println("Input String: " + "\"" + s + "\"" + "\n");
		System.out.println("  Vowels: " + vowels);
		System.out.println("  Consonants: " + consonants);
	}
}