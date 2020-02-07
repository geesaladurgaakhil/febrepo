package rivisionPack2;

public class GetNumericValue 
{
	public static void main(String[] args)
	{
		char ch='9';
		boolean b = Character.isDigit(ch);
		if(b==true)
		{
			int a = Character.getNumericValue(ch);
	System.out.println(a);
		}
}
}