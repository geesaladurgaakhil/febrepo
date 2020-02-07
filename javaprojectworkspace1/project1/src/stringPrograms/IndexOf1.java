package stringPrograms;

public class IndexOf1 
{
	public static void main(String[] args)
	{
		String s = "periperilicious";
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e',2));// second Occurance of e can be found with indexOf(with args)
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i',5));
		/*for(int j =3; j<=s.length()-1;j++)
		{
			System.out.println(s.indexOf('i'));
		}*/
		
	}

}
