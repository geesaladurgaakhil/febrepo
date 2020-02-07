package collectionsPack;

import java.util.Iterator;
import java.util.TreeSet;

public class Colour 
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		t1.add(new String("white"));
		t1.add(new String("pink"));
		t1.add(new String("blue"));
		t1.add(new String("voilet"));
		Iterator i1 = t1.iterator();
		while(i1.hasNext())
		{
			Object o = i1.next();//up casting
			String s = (String)o;//down casting
			System.out.println(s);
		}
		
		
	}

}
