package impProgramsPack;

import java.util.Scanner;

public class StringPrg1 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Data...");
		String s = scan.next();
		String s2 ="";
		System.out.println("Enter the first arg...");
		int a = scan.nextInt();
		System.out.println("Enter the second arg...");
		int b = scan.nextInt();
		String s3 = s.substring(a, b);
		for(int i=s3.length()-1; i>=0; i--)
		{
			char ch = s3.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s2);
		System.out.println(s.charAt(0)+s2+s.charAt(s.length()-1));
		scan.close();
	}

}
