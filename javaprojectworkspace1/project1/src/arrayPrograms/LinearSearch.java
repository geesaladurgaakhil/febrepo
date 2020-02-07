package arrayPrograms;

import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args)
	{
		int c, n, search, a[];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array...");
		n=scan.nextInt();
		a = new int[n];
		System.out.println("enter the elements of an array...");
		for(c=0; c<n; c++)
		{
			a[c]=scan.nextInt();
		}
		System.out.println("enter the value to find...");
		search = scan.nextInt();
		for(c=0; c<n; c++)
		{
			if(a[c]==search)
			{
				System.out.println("search is present in location : "+(c+1));
				break;
			}
		}
		if(c==n)
		{
			System.out.println("search is not present in array..");
		}
		scan.close();
	}

}
