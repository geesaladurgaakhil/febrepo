package revisionpackage;

public class Conversion 
{
	public static void main(String[] args)
	{
		char x ='A';
		for(char ch = 'A'; ch<='z';ch++)
		{
			System.out.print(x+"=");
			System.out.println((int) ch);
			x++;
		}
	}

}
