package stringPrograms;
import java.util.Scanner;
public class StringPrg2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String data");
		String data = scan.next(); 
		char c1 ='e';
		int count =0;
		for(int i =0; i<=data.length()-1; i++)
		{
			char c2 =data.charAt(i);
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}

}
