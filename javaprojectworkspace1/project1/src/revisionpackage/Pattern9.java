package revisionpackage;

public class Pattern9 
{
	public static void main(String[] args)
	{
		int space = 5;
		int star = 0;
		for(int i=1; i<=5; i++)
		{
			space--;
			star++;
			
			for(int k=1; k<=space; k++)
			{
					System.out.print(" ");
			}
			for(int j=1; j<=star; j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
