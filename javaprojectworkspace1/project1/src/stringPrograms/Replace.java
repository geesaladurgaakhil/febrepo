package stringPrograms;

public class Replace 
{
	public static void main(String[] args)
	{
		String s= "Developer";
		String s1 = " akhil";
		System.out.println(s.replace('d','*'));
		System.out.println(s.replace('e','E'));
		System.out.println(s.replace('r','R'));
		String s3 = s.concat(s1);
		System.out.println(s3);
	}

}
