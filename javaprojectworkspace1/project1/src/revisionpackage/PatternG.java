package revisionpackage;

public class PatternG 
{
	public static void main(String[] args)
	{
		int ls =4;
		int num=-1;
		for(int i=1;i<=4;i++)
		{
			ls--;
			num+=2;
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=num;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
