package revisionpackage;

public class PatternA 
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if((i==3)&&(j==3))
				{
					System.out.print("B ");
				}
				else
				{
					System.out.print("A ");
				}
			}
			System.out.println();
		}
	}

}
