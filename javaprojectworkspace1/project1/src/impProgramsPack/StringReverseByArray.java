package impProgramsPack;

import java.util.Scanner;

public class StringReverseByArray 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the string data..");
		String s = scan.next();
		char[] ch = s.toCharArray();
		for(int i=ch.length-1; i>=0; i--)
		{
			System.out.print(ch[i]);
		}
		scan.close();
	}

}
