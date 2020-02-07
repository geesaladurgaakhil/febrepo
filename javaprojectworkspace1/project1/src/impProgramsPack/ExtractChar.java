package impProgramsPack;

import java.util.Scanner;

public class ExtractChar 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String Data..");
		String s = scan.next();
		String s2 ="";
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			int k = s2.indexOf(ch);
			if(k==-1)
			{
				s2=s2+ch;
			}
		}
		System.out.println(s2);
		scan.close();
				
	}

}
