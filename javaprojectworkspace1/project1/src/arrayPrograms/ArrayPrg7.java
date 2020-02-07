package arrayPrograms;

import java.util.Scanner;

public class ArrayPrg7 
{
	public static void main(String[] args)
	{
		int sum =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size..");
		int a = scan.nextInt();
		System.out.println("Enter the values...");
		int a1[] = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("sum of elements present in a given Array");
		for(int i=0; i<=a1.length-1; i++)
		{
			sum=sum+a1[i];
		}
		System.out.println(sum);
		scan.close();
	}

}
