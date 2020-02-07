package rivisionPack2;

import java.util.Scanner;

public class StringPrg1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Data");
		String s = scan.nextLine();
		char ch = 'r';
		int count =0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch1 = s.charAt(i);
			if(ch==ch1)
			{
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
