// CREATED BY 'DK'
// DATE 20-07-2019

import java.util.Scanner;

class Duplicatex
{
	public static void main(String[] args) {
		int x[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 integers:");
		for (int w=0; w<x.length; w++) {
			x[w] = sc.nextInt();
		}
		int x1[] = new int[x.length];
		int newArrayIndex = 0;

		for (int i=0; i<x.length; i++) {
			boolean found = false;
			for (int s=i+1; s<x.length; s++) {
				if (x[i] != x[s]) continue;
				found = true;
				break;
			}
			if (!found) {
				x1[newArrayIndex] = x[i];
				newArrayIndex++;
			}
		}

		System.out.println("\nNew array:");
		for (int z=0; z<newArrayIndex; z++) {
			System.out.println(x1[z]);
		}
	}
};