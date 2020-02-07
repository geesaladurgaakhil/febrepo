package revisionpackage;

public class Pattern17 
{
	public static void main(String[] args)
	{
		int space=5;
		int ln = 0;
		int rn = -1;
		for(int i=1; i<=5;i++)
		{
			space--;
			ln++;
			rn++;
			for(int j=1; j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int x=1; x<=ln; x++)
			{
				System.out.print(x+" ");
			}
			for(int y=rn; y>=1;y--)
			{
				System.out.print(y+" ");
			}
			System.out.println();
			
		}
	}

}
