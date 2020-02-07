package collectionsPack;
import java.util.ListIterator;
import java.util.LinkedList;

public class Prg3 
{
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(85.5);
		l1.add(88.5);
		l1.add(84.8);
		ListIterator i1 = l1.listIterator();
		while(i1.hasNext())
		{
			Object o = i1.next();
			Double d1 = (Double)o;
			System.out.println(d1);
		}
		
	}

}
