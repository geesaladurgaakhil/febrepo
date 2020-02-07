package stringPrograms;
import java.util.Scanner;
public class StringPrg3 
{
	public static void main(String[] args)
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter string data");
		String s = scan.nextLine();
		char c1 = 'a';
		char c2 = 'e';
		char c3 = 'i';
		char c4 = 'o';
		char c5 = 'u';
		int count = 0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char c6 = s.charAt(i);
			if((c1==c6)||(c2==c6)||(c3==c6)||(c4==c6)||(c5==c6))
			{
				count++;
			}
		}
		System.out.println("Number of vowels in a given String "+count);
		scan.close();
		
	}

}
