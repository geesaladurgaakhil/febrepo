package revisionpackage;

public class PatternC 
{
	public static void main(String[] args)
	{
		
		for(char ch1='A'; ch1<='E'; ch1++)
		{
			for(char ch2='A'; ch2<='E'; ch2++)
			{
				if(ch1%2==0)
				{
					System.out.print(ch1+" ");
				}
				else
				{
					System.out.print(ch2+" ");
				}
			}
			System.out.println();
		}
	}
}
