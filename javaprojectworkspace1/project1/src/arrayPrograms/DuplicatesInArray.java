package arrayPrograms;
import java.util.Scanner;
public class DuplicatesInArray 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an array");
		int a = scan.nextInt();
		int[] a1 = new int[a];
		System.out.println("enter the values of an array..");
		for(int i =0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("Duplicates in the given array...");
		for(int i=0; i<=a1.length-1; i++)
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
