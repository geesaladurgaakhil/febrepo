package collectionsPack;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Sample7 
{
	public static void main(String[] args)
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(new String("apple"));
		l1.add(new String("orange"));
		l1.add(new String("banana"));
		Iterator i1 = l1.iterator();
		while(i1.hasNext())
		{
			Object o = i1.next();
			String s = (String)o;
			System.out.println(s);
		}
	}

}
