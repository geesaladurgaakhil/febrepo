package rivisionPack2;

public class StringPrg8 
{
	public static void main(String[] args)
	{
		String s ="education";
		System.out.println(s);
		char[] ch = s.toCharArray();
		String s1="";
		for(int i=0; i<=ch.length-1;i++)
		{
			if((ch[i]!='a')&&(ch[i]!='e')&&(ch[i]!='i')&&(ch[i]!='o')&&(ch[i]!='u'))
			{
				s1=s1+ch[i];
			}
		}
		System.out.println(s1);
	}

}
