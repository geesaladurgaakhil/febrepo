package rivisionPack2;

import java.util.Scanner;

public class StringPrg2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String data");
		String s = scan.next();
		char ch1 ='a';
		char ch2 ='e';
		char ch3 ='i';
		char ch4 ='o';
		char ch5 ='u';
		int count=0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char c6 = s.charAt(i);
			if((ch1==c6)||(ch2==c6)||(ch3==c6)||(ch4==c6)||(ch5==c6))
			{
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
