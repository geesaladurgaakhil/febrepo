package rivisionPack2;

import java.util.Scanner;

public class StringPrg3 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Data");
		String s = scan.next();
		String s1 ="";
		for(int i=s.length()-1;i>=0; i--)
		{
			char ch = s.charAt(i);
			s1=s1+ch;
		}
		System.out.println(s1);
		scan.close();
	}

}
