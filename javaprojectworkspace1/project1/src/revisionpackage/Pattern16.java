package revisionpackage;

public class Pattern16 
{
	public static void main(String[] args)
	{
		int ls= -1;
		int lstar= 2;
		int rs=10;
		int rstar= 2;
		for(int i=1;i<=5;i++) 
		{
			if(i<=5)
			{
				ls++;
				rs-=2;
			}
			else
			{
				ls--;
				rs+=2;
			}
			for(int j=1;j<=ls;j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=lstar;k++)
			{
				System.out.print("*");
			}
			for(int h=1;h<=rs;h++)
			{
				System.out.print(" ");
			}
			for(int f=1; f<=rstar;f++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

}
}
