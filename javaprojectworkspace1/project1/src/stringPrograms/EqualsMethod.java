package stringPrograms;

public class EqualsMethod 
{
	public static void main(String[] args)
	{
		String s = "akki";
		String s1 = "akki";
		String s2 = "Akki";
		boolean res = s.equals(s1);
		System.out.println(res);
		boolean re = s.equals(s2);
		System.out.println(re);
		boolean result = s.equalsIgnoreCase(s2);          // it ignore the individual comparission rather it checks only meaning..
		System.out.println(result);
		
	}
}

