package arrayPrograms;

import java.util.Scanner;

public class BinarySearch 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array..");
		int a = scan.nextInt();
		System.out.println("Enter the elements of Array..");
		int[] a1 = new int[a];
		for(int c=0; c<=a1.length-1; c++)
		{
			a1[c]=scan.nextInt();
		}
		System.out.println("Enter the element to  find in Array..");
		int search = scan.nextInt();
		int first =0;
		int last=a-1;
		int middle =(first+last)/2;
		while(first<=last)
		{
			if(a1[middle]<search)
			{
				first = middle+1;
			}
			else if(a1[middle]==search)
			{
				System.out.println(search+" found at location "+(middle+1)+".");
				break;
			}
			else
			{
				last=middle-1;
				middle=(first+last)/2;
			}
		}
		if(first>last)
		{
			System.out.println(search+" not found in array");
		}
		scan.close();
	}

}
