package stringPrograms;

public class StringPrg1 
{
	public static void main(String[] args)
	{
		String s1 = "developer";
		char c1 ='e';
		int count =0;
		for(int i =0; i<=s1.length()-1; i++)
		{
			char c2 = s1.charAt(i);
			if(c1==c2)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	

}
