package revisionpackage;

public class Pattern12 
{
	public static void main(String[] args)
	{
		int ls  = 6;
		int space = -2;
		int rs = 6;
		for(int i=1; i<=9; i++)
		{
			if(i<=5)
			{
				ls-=1;
				space+=2;
				rs-=1;
			}
			else
			{
				ls+=1;
				space-=2;
				rs+=1;
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
					System.out.print("$");
			}
			System.out.println();
		}

	}
}
