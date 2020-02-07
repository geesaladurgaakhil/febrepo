package stringPrograms;

import java.util.Scanner;

public class Extract 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scan.next();
		String s1 ="";
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch= s.charAt(i);
			int k = s1.indexOf(ch);
			if(k==-1)
			{
				s1=s1+ch;
			}
		}
		System.out.println(s1);
		scan.close();
	}

}
