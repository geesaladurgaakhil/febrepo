package revisionpackage;

public class Pattern14 
{
	public static void main(String[] args)
	{
	for(int i=1; i<=5; i++)
	{
		for(int k=1; k<=5; k++)
		{
			if((i==3)||(k==3))
			{
				System.out.print("@ ");
			}
			else
			{
				System.out.print("  ");
			}
		}
		System.out.println();
	}

	}

}
