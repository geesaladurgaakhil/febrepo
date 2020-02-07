package collectionsPack;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPrg1 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(75);
		a1.add(82);
		a1.add(16);
		a1.add(45);
		System.out.println(a1);
		//only fwd traversing
		Iterator i1 = a1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			Integer i = (Integer)o1;
			System.out.println(i);
		}
		//bi dirctional traversing
		ListIterator l1= a1.listIterator();
		while(l1.hasNext())
		{
			Object o1 = i1.next();
			Integer i = (Integer)o1;
			System.out.println(i);
		}
		while(l1.hasPrevious())
		{
			Object o1 = l1.previous();
			Integer i = (Integer)o1;
			System.out.println(i);
		}
		//get method
		for(int i =0; i<=a1.size()-1;i++)
		{
			Object o1= a1.get(i);
			Integer rv = (Integer)o1;
			System.out.println(rv);
		}
	}
	

}
