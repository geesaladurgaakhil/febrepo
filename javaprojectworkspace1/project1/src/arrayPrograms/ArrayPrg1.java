package arrayPrograms;

import java.util.Scanner;

public class ArrayPrg1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the values");
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=scan.nextInt();
			
		}
		System.out.println("Entered values are...");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.print(a[i]);
		}
		scan.close();
	}

}
