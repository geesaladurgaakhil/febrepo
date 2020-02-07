package demopack11;
import java.util.Scanner;
public class Pattern 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter Rows");
		int rows = scan.nextInt();
		System.out.println("enter column");
		int column= scan.nextInt();
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=column; j++)
			{
				System.out.print('*'+" ");
			}
			System.out.println();
		}
		
	}

}
