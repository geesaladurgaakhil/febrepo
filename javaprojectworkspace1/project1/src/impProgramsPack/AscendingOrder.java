package impProgramsPack;

import java.util.Scanner;

public class AscendingOrder 
{
	public static void main(String[] args)
	{
		int temp=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size..");
		int a = scan.nextInt();
		System.out.println("Enter the elements in an array..");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("Entered elements in an array..");
		for(int i=0; i<=a1.length-1; i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("assecnding order of the elements in an array...");
		for(int i=0; i<=a1.length-1; i++)
		{
			for(int j=i+1; j<=a1.length-1; j++)
			{
				if(a1[i]>a1[j])
				{
					temp=a1[i];
					a1[i]=a1[j];
					a1[j]=temp;
				}
			}
		}
		for(int z=0;z<=a1.length-1;z++)
		{
			System.out.println(a1[z]);
		}
		scan.close();
	}

}
