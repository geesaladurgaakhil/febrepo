package revisionpackage;

public class Patterns15 
{
	public static void main(String[] args)
	{
		int ls= -1;
		int star= 9;
		for(int i=1;i<=7;i++) 
		{
			if(i<=4)
			{
				ls++;
				star-=2;
			}
			else
			{
				ls--;
				star+=2;
			}
			for(int j=1;j<=ls;j++)
			{
				System.out.print("  ");
			}
			for(int k=1; k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
