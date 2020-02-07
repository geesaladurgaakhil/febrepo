package collectionsPack;
import java.util.Iterator;

import java.util.TreeSet;

public class Sample1 
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add(new Integer(34));
		t1.add(new Integer(78));
		t1.add(new Integer(12));
		Iterator i1 = t1.iterator();
		while(i1.hasNext())
		{
			Object o = i1.next();
			Integer i = (Integer)o;
			System.out.println(i);
		}
	}

}
