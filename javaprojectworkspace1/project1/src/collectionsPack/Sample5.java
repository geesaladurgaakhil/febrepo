package collectionsPack;
import java.util.Iterator;
import java.util.HashSet;

public class Sample5 
{
	public static void main(String[] args)
	{
		HashSet h1 = new HashSet();
		h1.add(new String("inorbit mall"));
		h1.add(new String("charminar"));
		h1.add(new String("lb stadium"));
		Iterator i1 = h1.iterator();
		while(i1.hasNext())
		{
			Object o1 = i1.next();
			String s =(String)o1;
			System.out.println(s);
		}
	}
}
