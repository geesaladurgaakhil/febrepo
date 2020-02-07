package revisionpackage;

public class PatternH 
{
	public static void main(String[] args)
	{
		int ls =5;
		int lnum=0;
		int rnum=-1;
		for(int i=1;i<=5;i++)
		{
			ls--;
			lnum++;
			rnum++;
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=lnum;k++)
			{
				System.out.print(k);
			}
			for(int h=rnum;h>=1;h--)
			{
				System.out.print(h);
			}
			System.out.println();
		}
	}


}
