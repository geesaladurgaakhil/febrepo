package arrayPrograms;

import java.util.Scanner;

public class SceondHighest 
{
	public static void main(String[] args)
	{
		int first=0;
		int second=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the Size of an array");
		int a = scan.nextInt();
		System.out.println("enter the values..");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("2nd maximum value in an array...");
		for(int i=0; i<=a1.length-1; i++)
		{
			if(first<a1[i])
			{
				second=first;
				first=a1[i];
			}
			else if(second<a1[i])
			{
				second=a1[i];
			}
		}
		System.out.println(second);
		scan.close();
			
	}

}
