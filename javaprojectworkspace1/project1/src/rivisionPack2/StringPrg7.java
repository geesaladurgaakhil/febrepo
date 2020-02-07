package rivisionPack2;

import java.util.Scanner;

public class StringPrg7 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String data");
		String s = scan.nextLine();
		String s1 ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			s1=s1+ch;
		}
		System.out.println(s1);
		String[] s3 = s1.split(" ");
		for(int i=s3.length-1; i>=0; i--)
		{
			System.out.print(s3[i]+" ");
		}
		scan.close();
	}

}
