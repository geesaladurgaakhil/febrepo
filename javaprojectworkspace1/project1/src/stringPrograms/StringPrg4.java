package stringPrograms;
import java.util.Scanner;
public class StringPrg4 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the String data");
		String s = scan.next();
		char c1 = 'a';
		char c2 = 'e';
		char c3 = 'i';
		char c4 = 'o';
		char c5 = 'u';
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;
		for(int i=0; i<=s.length()-1; i++)
		{
			char c6 = s.charAt(i);
			if(c1==c6)
			{
				countA++;
			}
			else if(c2==c6)
			{
				countE++;
			}
			else if(c3==c6)
			{
				countI++;
			}
			else if(c4==c6)
			{
				countO++;
			}
			else if(c5==c6)
			{
				countU++;
			}
		
		}
		System.out.println("count of vowel A in a given String "+countA);
		System.out.println("count of vowel E in a given String "+countE);
		System.out.println("count of vowel I in a given String "+countI);
		System.out.println("count of vowel O in a given String "+countO);
		System.out.println("count of vowel U in a given String "+countU);
		scan.close();
	}

}
