package collectionsPack;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;

public class Prg10 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(5);
		a1.add(5.2);
		a1.add('a');
		a1.add("akki");
		a1.add(true);
		System.out.println("Elements in ArrayList");
		System.out.println(a1);
		Vector v = new Vector();
		v.add(1);
		v.add(99.9);
		v.add('X');
		v.add("durga");
		v.add(false);
		System.out.println("Elements in Vector..");
		System.out.println(v);
		LinkedList l = new LinkedList();
		l.addAll(a1);
		l.addAll(v);
		System.out.println("Elements of ArrayList and Vector in LinkedList..");
		System.out.println(l);


		
	}

}
