package impProgramsPack;

import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String Data...");
		String s = scan.next();
		String s2 ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			s2=s2+ch;
		}
		System.out.println(s2);
		scan.close();
		if(s.equals(s2))
		{
			System.out.println("given string is a palindrome....");
		}
		else
		{
			System.out.println("given string is not a palindrome....");
		}
	}

}
