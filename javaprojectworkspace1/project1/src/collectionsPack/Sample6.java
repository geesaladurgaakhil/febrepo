package collectionsPack;
import java.util.Iterator;
import java.util.HashSet;

public class Sample6 
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(new Integer(5));
		h1.add(new Double(6.5));
		h1.add(new Double(7.5));
		h1.add(new Character('a'));
		h1.add(new String("hi"));
		Iterator i1 = h1.iterator();
		Object o1 = i1.next();
		Integer rv1=(Integer)o1;
		System.out.println(rv1);
		Object o2 = i1.next();
		Double rv2=(Double)o2;
		System.out.println(rv2);
		Object o3 = i1.next();
		Double rv3=(Double)o3;
		System.out.println(rv3);
		Object o4 = i1.next();
		Character rv4=(Character)o4;
		System.out.println(rv4);
		Object o5 = i1.next();
		String rv5=(String)o5;
		System.out.println(rv5);
	}

}
