package demopackage2;

public class Library 
{
	public static void main(String[] args)
	{
		Book  b = new Book("HTML","raja",255.2);
		System.out.println(b);
		Book  b1 = new Book("HTML","raja",255.2);
		Book  b2 = new Book("HTML","raja",255.5);
		boolean status=b1.equals(b2);
		System.out.println(status);
	}
}

