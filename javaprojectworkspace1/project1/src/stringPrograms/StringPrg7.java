package stringPrograms;

public class StringPrg7 
{
	public static void main(String[] args)
	{
		String s = "html java sql jdbc";
		System.out.println(s);
		String s1 ="";          // first convert given string in reverse order...
		for(int i=s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			s1=s1+ch;
		}
		
		String[] s3 = s1.split(" ");   // split the reversed string....
		for(int i=s3.length-1; i>=0; i--) // print the splitted string in resverse order..
		{
			System.out.print(s3[i]+" ");
		}
				
	}

}
