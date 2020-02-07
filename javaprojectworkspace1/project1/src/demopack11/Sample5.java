package demopack11;

public class Sample5 
{
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		try
		{
			division();
		}
		catch(ArithmeticException rv)
		{
			System.out.println("b is invalid..");
			System.out.println("re enter b value");
		}
	}
	public static void division()
	{
		int a=30;
		int b= 0;
		System.out.println(a/b); 
	}

}
