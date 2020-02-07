package stringPrograms;

import java.util.Scanner;

public abstract class NoOfDigitsInString 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string....");
		String s = scan.next();
		int count=0;
		char c0 ='0';
		char c1 ='1';
		char c2 ='2';
		char c3 ='3';
		char c4 ='4';
		char c5 ='5';
		char c6 ='6';
		char c7 ='7';
		char c8 ='8';
		char c9 ='9';
		for(int i=0; i<=s.length()-1; i++)
		{
			char x = s.charAt(i);
			if((x==c0)||(x==c1)||(x==c2)||(x==c3)||(x==c4)||(x==c5)||(x==c6)||(x==c7)||(x==c8)||(x==c9))
			{
				count++;
			}
		}
		System.out.println(count);
		scan.close();
		

	}

}
