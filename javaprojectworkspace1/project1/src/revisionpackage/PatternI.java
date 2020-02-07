package revisionpackage;

public class PatternI 
{
	public static void main(String[] args)
	{
		int ls =6;
		int alpha=63;
		for(int i=1;i<=6;i++)
		{
			ls--;
			alpha+=2;
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=65;k<=alpha;k++)
			{
				System.out.print((char) k);
			}
			System.out.println();
		}
	}

}
