package arrayPrograms;

import java.util.Scanner;

public class MaximumNumberInArray 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = scan.nextInt();
		System.out.println("Enter the Values of an array");
		int[] a1 = new int[a];
		for(int i =0; i<=a1.length-1; i++)
		{
			a1[i] = scan.nextInt();
		}
		int max=a1[0];
		System.out.println("maximum Value of an array");
		for(int i = 0; i<=a1.length-1; i++)
		{
			if(max<a1[i])
			{
			  max=a1[i];
			}
		}
		System.out.println(max);
		scan.close();

	}

}
