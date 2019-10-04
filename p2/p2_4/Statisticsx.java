// CREATED BY 'DK'
// DATE 20-07-2019

import java.util.Scanner;
import java.lang.Math;

class Statisticsx
{
	double mean(int data[])
	{
		int sumx = 0;
		for (int i=0; i<data.length; i++) sumx += data[i];
		return sumx/data.length;
	}
	double variance(int data[])
	{
		double avg = mean(data);
		double vr = 0.0;
		for (int j=0; j<data.length; j++) vr += Math.pow((data[j] - avg), 2);
		return vr/data.length;
	}
	double stdDev(int data[])
	{
		return Math.sqrt(variance(data));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of input array:");
		int aSize = sc.nextInt();
		int inputArray[] = new int[aSize];
		System.out.println("\nEnter " + aSize + " elements:");
		for (int inum=0; inum<aSize; inum++) inputArray[inum] = sc.nextInt();

		System.out.println("\n1. Mean\n2. Variance\n3. Standard Deviation\n  Choose an option:");
		int choice = sc.nextInt();
		System.out.println();
		switch(choice)
		{
			case 1:
			System.out.println("Mean: " + new Statisticsx().mean(inputArray));
			break;
			case 2:
			System.out.println("Variance: " + new Statisticsx().variance(inputArray));
			break;
			case 3:
			System.out.println("Standard Deviation: " + new Statisticsx().stdDev(inputArray));
			break;
			default:
			System.out.println("Incorrect input");
		}
	}
}