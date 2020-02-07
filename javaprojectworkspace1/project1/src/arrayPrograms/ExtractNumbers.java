package arrayPrograms;

import java.util.Scanner;

public class ExtractNumbers 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the SIZE of array..");
		int a = scan.nextInt();
		System.out.println("enter the numbers..");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("after extracting numbers....");
		for(int i=0; i<=a1.length-1;i++)
		{
			for(int j=i+1; j<=a1.length-1; j++)
			{
				if(a1[i]==a1[j])
				{
					System.out.println(a1[j]);
				}
			}
		}
		scan.close();
	}

}
