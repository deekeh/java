// CREATED BY 'DK'
// DATE 20-07-2019

import java.util.Scanner;

class Matrix
{
	public static void main(String[] args) {
		int x[][] = new int[3][3];
		int y[][] = new int[3][3];
		int a[][] = {{0,0,0},{0,0,0},{0,0,0}};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first 3x3 matrix:");
		for (int i1=0; i1<3; i1++)
			for (int j1=0; j1<3; j1++)
				x[i1][j1] = sc.nextInt();
		System.out.println("Enter second 3x3 matrix:");
		for (int i1=0; i1<3; i1++)
			for (int j1=0; j1<3; j1++)
				y[i1][j1] = sc.nextInt();
		
		for (int i=0; i<3; i++)
			for (int j=0; j<3; j++)
				for (int k=0; k<3; k++)
					a[i][j] = a[i][j] + (x[i][k] * y[k][j]);

		System.out.println("\n--------------------SOLUTION--------------------");
		for (int u=0; u<3; u++) {
			System.out.print(x[u][0] + "\t" + x[u][1] + "\t" + x[u][2] + "\t");
			if (u == 0) System.out.print("*\t");
			else System.out.print(" \t");
			System.out.print(y[u][0] + "\t" + y[u][1] + "\t" + y[u][2] + "\t");
			if (u == 0) System.out.print("=\t");
			else System.out.print(" \t");
			System.out.print(a[u][0] + "\t" + a[u][1] + "\t" + a[u][2] + "\t\n");
		}
	}
}