package impProgramsPack;

import java.util.Scanner;

public class PrimeNumber 
{ 
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 = scan.nextInt();
		int count =0;
		// int num1 =20; //number to be checked...
		int num2= num1/2;
		if(num1==0||num1==1)
		{
			System.out.println(num1 + " is Not a Prime number...");
		}
		else
		{
			for(int i=2; i<=num2;i++)
			{
				if(num1%i==0)
				{
					System.out.println(num1 + " is Not a Prime number...");
					count=1;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(num1 + " is a Prime number...");
			}
		}
		scan.close();
	}

}
