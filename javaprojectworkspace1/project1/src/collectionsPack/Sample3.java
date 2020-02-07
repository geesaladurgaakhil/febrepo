package collectionsPack;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample3 
{
	public static void main(String[] args)
	{
		TreeSet t1= new TreeSet();
		t1.add(new Integer(11));
		t1.add(new Integer(2));
		t1.add(new Integer(53));
		t1.add(new Double(3.5));
		t1.add(new String("hi nmbers"));
		Iterator i1 = t1.iterator();
		Object o1 = i1.next();
		Integer rv1 =(Integer)o1;
		System.out.println(rv1);
		Object o2 = i1.next();
		Integer rv2 =(Integer)o2;
		System.out.println(rv2);
		Object o3 = i1.next();
		Integer rv3 =(Integer)o3;
		System.out.println(rv3);
		Object o4 = i1.next();
		Double rv4 =(Double)o4;
		System.out.println(rv4);
		Object o5 = i1.next();
		String rv5 =(String)o5;
		System.out.println(rv5);
		
		
		
				
	}

}
