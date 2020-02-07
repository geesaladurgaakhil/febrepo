package collectionsPack;

import java.util.Iterator;
import java.util.TreeSet;

public class Sample2 
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add(new Integer(34));
		t1.add(new Integer(78));
		t1.add(new Integer(12));
		Iterator i1 = t1.iterator();
		//1st Element(object)
		Object o1 = i1.next();
		Integer rv1 =(Integer)o1;
		System.out.println(rv1);
		//2nd Element(object)
		Object o2 = i1.next();
		Integer rv2 =(Integer)o2;
		System.out.println(rv2);
		//3rd Element(object)
		Object o3 = i1.next();
		Integer rv3 =(Integer)o3;
		System.out.println(rv3);
		
	}

}
