package revisionpackage;

public class Pattern11 
{
	public static void main(String[] args)
	{
		int ls  = -1;
		int space = 16;
		int rs = -1;
		for(int i=1; i<=7; i++)
		{
			if(i<=4)
			{
			ls+=2;
			space-=4;
			rs+=2;
			}
			else
			{
				ls-=2;
				space+=4;
				rs-=2;
			}
			for(int k=1; k<=ls; k++)
			{
					System.out.print("*");
			}
		
			for(int f=1; f<=space; f++)
			{
					System.out.print(" ");
			}
			for(int j=1; j<=rs; j++)
			{
					System.out.print("*");
			}
			System.out.println();
		}

	}
}
