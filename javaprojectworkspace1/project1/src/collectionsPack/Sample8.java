package collectionsPack;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample8 
{
	public static void main(String[] args)
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(new Double(2.5));
		l1.add(new Character('X'));
		l1.add(new Character('c'));
		l1.add(new String("akki"));
		l1.add(new String("akhil"));
		l1.add(new String("durga"));
		l1.add(new Boolean(true));
		Iterator i1 = l1.iterator();
		Object o1 = i1.next();
		Double s1=(Double)o1;
		System.out.println(s1);
		Object o2 = i1.next();
		Character s2=(Character)o2;
		System.out.println(s2);
		Object o3 = i1.next();
		Character s3=(Character)o3;
		System.out.println(s3);
		Object o4 = i1.next();
		String s4=(String)o4;
		System.out.println(s4);
		Object o5 = i1.next();
		String s5=(String)o5;
		System.out.println(s5);
		Object o6 = i1.next();
		String s6=(String)o6;
		System.out.println(s6);
		Object o7 = i1.next();
		Boolean s7=(Boolean)o7;
		System.out.println(s7);
		
	}

}
