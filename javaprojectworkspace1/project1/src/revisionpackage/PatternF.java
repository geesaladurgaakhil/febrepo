package revisionpackage;

public class PatternF 
{
	public static void main(String[] args)
	{
		int ls =5;
		int ln=0;
		int rn=0;
		for(int i=1;i<=5;i++)
		{
			ls--;
			ln++;
			rn++;
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=ln;k>=1;k--)
			{
				System.out.print(k);
			}
			for(int n=1;n<=rn;n++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
