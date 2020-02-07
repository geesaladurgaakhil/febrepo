package rivisionPack2;

import java.util.Scanner;

public class StringPrg6 
{
	public static void main(String[] args)
	{
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = Scan.next();
		String s2="";
		System.out.println("enter first argument");
		int a = Scan.nextInt();
		System.out.println("enter second argument");
		int b = Scan.nextInt();
		String s1 = s.substring(a, b);
		for(int i=s1.length()-1; i>=0; i--)
		{
			char ch = s1.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s.charAt(0)+s2+s.charAt(s.length()-1));
		Scan.close();
	}

}
