package collectionsPack;
import java.util.Iterator;
import java.util.TreeSet;

public class Sample4 
{
	public static void main(String[] args)
	{
		TreeSet t1 = new TreeSet();
		//t1.add(new Double(5.5));
		t1.add(5.5);                           //from jdk 1.5 boxing is implicit.........
		t1.add(new Double(5.6));
		t1.add(new Double(5.7));
		t1.add(new Double(5.8));
		t1.add(new Double(5.9));
		Iterator i1 = t1.iterator();
		int count=0;
		while(i1.hasNext())
		{
			Object o = i1.next();
			Double d =(Double)o;
			System.out.println(d);
			count++;
			if(count==3)
			{
				break;
			}
		}
		i1.next();
		i1.remove();
		while(i1.hasNext())
		{
			Object o = i1.next();
			Double d =(Double)o;
			System.out.println(d);
		}
		
	}

}
