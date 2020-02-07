package collectionsPack;
import java.util.Vector;
import java.util.Scanner;

public class Prg9 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String objects");
		String a=s.next();
		String b=s.next();
		String c=s.next();
		String d=s.next();
		Vector v = new Vector();
		v.add(a);
		v.add(b);
		v.add(c);
		v.add(d);
		System.out.println("Before removal of elements...");
		System.out.println(v);
		System.out.println("enter the particular locatioon to remove");
		int x= s.nextInt();
		v.remove(x);
		System.out.println("After removal of elements...");
		System.out.println(v);

		
	}

}
