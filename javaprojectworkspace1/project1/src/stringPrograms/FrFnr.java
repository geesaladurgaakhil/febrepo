package stringPrograms;

public class FrFnr 
{
	public static void main(String[] args)
	{
		String s ="aakkiil";
		char[] a= s.toCharArray();
		char fr=a[0];
		char fnr= a[0];
		for(int i=1; i<a.length; i++)
		{
			if(fr==a[i])
			{
				fr=a[i];
			}
		}
		System.out.println(fr);
		for(int i=1; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]!=a[j])
				{
					fnr=a[j];
				}
			}
		}
		System.out.println(fnr);
	}
}