package stringPrograms;

public class Sample10 
{
	public static void main(String[] args)
	{
		String s = "hi9";
		for(int i=0; i<=s.length()-1; i++)
		{
			char ch = s.charAt(i);
			boolean b = Character.isDigit(ch);
			if(b==true)
			{
			int a = Character.getNumericValue(ch);
			System.out.println(a);
			}
		}
		
	}
}
