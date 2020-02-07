package arrayPrograms;
import java.util.Scanner;

public class MissingNumberFrom1to100 
{
	public  static void main(String[] args)
	{
		int status=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int a = scan.nextInt();
		System.out.println("Enter the user values of an array");
		int[] a1= new int[a];
		for(int i=0; i<=a1.length-1; i++)
		{
			a1[i]=scan.nextInt();
		}
		System.out.println("Entered  user values of an array");
		for(int i=0; i<=a1.length-1; i++)
		{
			System.out.println(a1[i]);
		}
		System.out.println("numbers from 1 to 100 except user entered values....");
		for(int i=1; i<=100; i++)
		{
			for(int j=0; j<=a1.length-1; j++)
			{
				if(i==a1[j])
				{
					status=1;
					break;
				}
				else
				{ 
					status=0;
				}
			}
			if(status==0)
			{
				System.out.println(i);
			}
		}
		scan.close();
	}
}
