package arraypack;

public class Sample 
{
	public static void main(String[] args)
	{
		String s1 = "welcome";
		char ch ='o';
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch1=s1.charAt(i);
			if(ch1!=ch)
			{
				System.out.println(ch1);
			}
		}
		
	}

}
