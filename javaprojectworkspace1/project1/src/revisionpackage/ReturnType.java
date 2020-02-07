package revisionpackage;

public class ReturnType 
{
	public static void main(String[] args)
	{
		int k =test1(2,3);
		System.out.println(k);
		int x =test1(2,5.5);
		System.out.println(x);
		String i = test2();
		System.out.println(i);
		boolean j = test3();
		System.out.println(j);
	}
	public static int test1(int a,int b)
	{
		System.out.println("inside test1 int a,int b");
		return 75;
	}
	public static int test1(int a,double b)
	{
		System.out.println("inside test1 int a,double b");
		return 50;
	}
	public static String test2()
	{
		System.out.println("akki");
		return "html";
	}
	public static boolean test3()
	{
		return true;
	}
}
