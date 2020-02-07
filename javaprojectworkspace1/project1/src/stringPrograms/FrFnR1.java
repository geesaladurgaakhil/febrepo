package stringPrograms;

import java.util.Scanner;

public class FrFnR1 
{
	public static void main(String[] arg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String...");
		String s =scan.next();
		char[] a = s.toCharArray();
		char fr=a[0];
		char fnr=a[0];
		for( int i=1; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]==a[j])
				{
					fr=a[j];
				}
				else if(fr==a[i])
				{
					fr=a[i];
				}
	
					
			}
		}
		System.out.println("first repetativr char "+fr);
		for(int i=1; i<=a.length-1; i++)
		{
			for(int j=i+1; j<=a.length-1; j++)
			{
				if(a[i]!=a[j])
				{
					fnr=a[i];
				}
				fnr=a[j];
			}
				
		}
		System.out.println(fnr);
	}

}
