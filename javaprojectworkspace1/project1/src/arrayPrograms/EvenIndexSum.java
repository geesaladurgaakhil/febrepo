package arrayPrograms;

import java.util.Scanner;

public class EvenIndexSum 
{
	public static void main(String[] args)
	{
		int sumeven=0;
		int sumodd=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array...");
		int a = scan.nextInt();
		System.out.println("Enter the values");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		for(int i=0; i<=a1.length-1; i++)
		{
			if(i%2==0)
			{
				sumeven=sumeven+a1[i];
			}
			else
			{
				sumodd=sumodd+a1[i];
			}
			
		}
		System.out.println("sum of elements in even number index is "+sumeven);
		System.out.println("sum of elements in odd number index is "+sumodd);
		scan.close();
	}
}
