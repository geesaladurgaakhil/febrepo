package demopack11;

public class Sample3 
{
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception caught");
		}
		
		System.out.println("hi");
		System.out.println("main ends...");
	}

}
