package stringPrograms;

public class SplitMethod 
{
	public static void main(String[] args)
	{
		String s1 = "java developer";
		String[] s2 = s1.split("de");
		System.out.println(s2[0]);
		System.out.println(s2[1]);
	}
}
	