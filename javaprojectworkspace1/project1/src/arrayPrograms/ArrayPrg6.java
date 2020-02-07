package arrayPrograms;

import java.util.Scanner;

public class ArrayPrg6 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array Size....");
		int a = scan.nextInt();
		System.out.println("Enter the String data....");
		String[] s = new String[a];
		for(int i=0; i<=s.length-1; i++)
		{
			s[i]=scan.next();
		}
		System.out.println("string data present in even index numbers are....");
		for(int i=0; i<=s.length-1; i+=2)
		{
			System.out.println(s[i]);
		}
		/*for(int i=0; i<=s.length-1; i++)
		{
			i++;
			System.out.println(s[i]);
		}*/
		scan.close();
		
	}

}
