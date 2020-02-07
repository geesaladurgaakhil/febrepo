package arrayPrograms;

import java.util.Scanner;

public class CopyOfArray 
{
	public static void main(String[] args)
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the array size..");
		int a = scan.nextInt();
		System.out.println("Enter the values in an array");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		/*System.out.println("Entered values in an array");
		for(int i=0;i<=a1.length-1;i++)
		{
			System.out.println(a1[i]);
		}*/
		System.out.println("copied values in a new array");
		int[] x = new int[a];
		for(int i=0;i<=x.length-1;i++)
		{
			x[i]=a1[i];
		}
		for(int i=0;i<=x.length-1;i++)
		{
			System.out.println(x[i]);
		}
		scan.close();
	}

}