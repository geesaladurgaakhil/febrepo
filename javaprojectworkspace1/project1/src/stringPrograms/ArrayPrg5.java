package stringPrograms;

import java.util.Scanner;

public class ArrayPrg5 
{
	public static void main(String[] args)
	{
		int count =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size");
		int size1 = scan.nextInt();
		System.out.println("Enter the second array size");
		int size2 = scan.nextInt();
		int[] a = new int[size1];
		System.out.println("enter the values of first array");
		for(int i=0; i<=a.length-1;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("entered numbers are...");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		int[] b = new int[size2];
		System.out.println("enter the values of second array");
		for(int i=0; i<=b.length-1;i++)
		{
			b[i]=scan.nextInt();
		}
		System.out.println("entered numbers are...");
		for(int i=0; i<=b.length-1;i++)
		{
			System.out.println(b[i]);
		}
		int size3 = size1+size2;
		int[] c=new int[size3];
		for(int i=0; i<size1; i++)
		{
			c[count]=a[i];
			count++;
		}
		for(int i=0; i<size2; i++)
		{
			c[count]=b[i];
			count++;
		}
		System.out.println("Entered values in the third array are...");
		for(int i=0;i<=c.length-1;i++)
		{
			System.out.print(c[i]);
		}
		scan.close();
	}

}
