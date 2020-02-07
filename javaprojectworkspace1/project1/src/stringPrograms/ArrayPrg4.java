package stringPrograms;

import java.util.Scanner;

public class ArrayPrg4 
{
	public static void main(String[] args)
	{
		int j=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first array size");
		int a = scan.nextInt();
		System.out.println("Enter the second array size");
		int b = scan.nextInt();
		int[] x = new int[a];
		System.out.println("Enter the first array values");
		int[] y = new int[b];
		for(int i=0; i<=x.length-1; i++)
		{
			x[i]=scan.nextInt();
		}
		for(int i=0; i<=x.length-1; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("Enter the second array values");
		for(int i=0; i<=y.length-1; i++)
		{
			y[i]=scan.nextInt();
		}
		for(int i=0; i<=y.length-1; i++)
		{
			System.out.println(y[i]);
		}
		System.out.println("Entered third array values");
		int c = a+b;
		int[] z = new int[c];
		for(int i=0; i<=x.length-1;i++)
		{
			z[i]=x[i];
			j++;
		}
		for(int k=0; k<=y.length-1; k++)
		{
			z[j]=y[k];
			j++;
		}
		for(int i=0; i<=z.length-1;i++)
		{
			System.out.println(z[i]);
		}
		
		scan.close();
		
	}

}
