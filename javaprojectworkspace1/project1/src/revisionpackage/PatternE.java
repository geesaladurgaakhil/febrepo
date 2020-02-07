package revisionpackage;

public class PatternE 
{
	public static void main(String[] args)
	{
		int ls =5;
		int ln=0;
		int rn=0;
		for(int i=1;i<=9;i++)
		{
			if(i<=5)
			{
			ls--;
			ln++;
			rn++;
			}
			else
			{
				ls++;
				ln--;
				rn--;
			}
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=ln;k++)
			{
				System.out.print(k);
			}
			for(int n=rn;n>=1;n--)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}

}
