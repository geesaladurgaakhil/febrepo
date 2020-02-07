package demopack11;

public class Sample4 
{
	public static void main(String[] args)
	{
		System.out.println("main starts...");
		try
		{
			display();
		}
		catch(InterruptedException rv)
		{
			System.out.println("Exception caught.");
		}
		System.out.println("main ends...");
	}
	public static void display() throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Hi");
	}
	

}
