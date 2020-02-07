package impProgramsPack;

public class StringPrg 
{
	public static void main(String[] args)
	{
		String s ="html jdbc java sql";
		System.out.println(s);
		String s2 ="";
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			s2=s2+ch;
		}
		String[] s3 = s2.split(" ");
		for(int i=s3.length-1; i>=0; i--)
		{
			System.out.print(s3[i]+" ");
		}
	}
}
