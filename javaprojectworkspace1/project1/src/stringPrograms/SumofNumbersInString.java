package stringPrograms;

import java.util.Scanner;

public class SumofNumbersInString 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string data");
		String s = scan.next();
		int sum =0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch=s.charAt(i);
			boolean b = Character.isDigit(ch);
			if(b==true)
			{
				int a = Character.getNumericValue(ch);
				sum = sum+a;
			}
		}
		System.out.println(sum);
		scan.close();
	}

}
