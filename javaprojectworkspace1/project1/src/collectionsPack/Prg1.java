package collectionsPack;
import java.util.ListIterator;
import java.util.ArrayList;

public class Prg1 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add("html");
		a1.add("java");
		a1.add("jdbc");
		a1.add("c");
		ListIterator l1 = a1.listIterator();
		while(l1.hasNext())
		{
			Object o1 = l1.next();
			String s = (String)o1;
			System.out.println(s);
		}
		while(l1.hasPrevious())
		{
			Object o1 = l1.previous();
			String s = (String)o1;
			System.out.println(s);
		}
		
	}

}
