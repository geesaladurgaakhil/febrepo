package collectionsPack;
import java.util.Iterator;
import java.util.LinkedList;

public class Prg4 
{
	public static void main(String[] args)
	{
		LinkedList l1 = new LinkedList();
		l1.add(3.1);
		l1.add(88);
		l1.add('a');
		l1.add("akki");
		Iterator i1 = l1.iterator();
		Object o1 = i1.next();
		Double d1=(Double)o1;
		System.out.println(d1);
		Object o2 = i1.next();
		Integer d2=(Integer)o2;
		System.out.println(d2);
		Object o3 = i1.next();
		Character d3=(Character)o3;
		System.out.println(d3);
		Object o4 = i1.next();
		String d4=(String)o4;
		System.out.println(d4);
		
	
	}

}
