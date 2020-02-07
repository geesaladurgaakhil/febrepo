package revisionpackage;

public class Pattern13 
{
	public static void main(String[] args)
	{
	int lsp  = 5;
	int star = -1;
	for(int i=1; i<=9; i++)
	{
		if(i<=5)
		{
		lsp-=1;
		star+=2;
		}
		else
		{
			lsp+=1;
			star-=2;
		}
		for(int k=1; k<=lsp; k++)
		{
				System.out.print("  ");
		}
	
		for(int f=1; f<=star; f++)
		{
				System.out.print("* ");
		}
		System.out.println();
	}

	}
}
