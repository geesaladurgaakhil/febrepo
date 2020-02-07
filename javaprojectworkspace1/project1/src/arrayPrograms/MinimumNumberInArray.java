package arrayPrograms;

import java.util.Scanner;

public class MinimumNumberInArray 
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
		System.out.println("minimum Value in an array");
		int min =a1[0];
		for(int i=0; i<=a1.length-1; i++)
		{
			if(a1[i]<=min)
			{
			  min=a1[i];
			}
		}
		System.out.println(min);
		scan.close();
	}


}
