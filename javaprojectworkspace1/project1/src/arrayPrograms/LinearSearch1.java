package arrayPrograms;

import java.util.Scanner;

public class LinearSearch1 
{
	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size  of an array");
		int  s = scan.nextInt();
		int[] a = new int[s];
		System.out.println("Enter the "+s+" elements of an array");
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter the value to find...");
		int search = scan.nextInt();
		for(int i=0; i<=a.length-1; i++)
		{
			if(a[i]==search)
			{
				System.out.println("search is present in location : "+(i+1));
				break;
			}
			else
			{
				System.out.println("search is not present in array");
				break;
			}
		}
		scan.close();
	}

}
