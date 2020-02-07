package demopackage2;

public class Home 
{
	public static void main(String[] args)
	{
		Clock c1 = new Clock(2,29,30);
		Clock c2 = new Clock(2,29,30);
		System.out.println(c1);
		System.out.println(c2);
		boolean status = c1.equals(c2);
		System.out.println(status);
		
		
	}

}
