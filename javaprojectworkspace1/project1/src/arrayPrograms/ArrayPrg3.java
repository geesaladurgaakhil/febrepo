package arrayPrograms;

import java.util.Scanner;

public class ArrayPrg3 
{
	public static void main(String[] args)
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		String[] a = new String[size];
		System.out.println("Enter the values");
		for(int i=0; i<=a.length-1; i++)
		{
			a[i]=scan.next();
			
		}
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		scan.close();
	}


}
