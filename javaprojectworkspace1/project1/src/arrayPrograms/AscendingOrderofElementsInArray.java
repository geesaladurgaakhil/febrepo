package arrayPrograms;

import java.util.Scanner;

public class AscendingOrderofElementsInArray 
{
	public static void main(String[] args)
	{
		int temp =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array..");
		int a = scan.nextInt();
		System.out.println("enter the elements in an array..");
		int[] a1 = new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("entered elements in an array..");
		for(int i=0; i<=a1.length-1; i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("ascending order of elements in an array..");
		for(int x=0; x<=a1.length-1; x++)
		{
			for(int y=x+1; y<=a1.length-1;y++)
			{
				if(a1[x]>a1[y])
				{
					temp=a1[x];
					a1[x]=a1[y];
					a1[y]=temp;
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
