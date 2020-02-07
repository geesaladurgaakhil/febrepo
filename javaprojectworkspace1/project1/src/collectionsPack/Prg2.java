package collectionsPack;

import java.util.ArrayList;

public class Prg2 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(52);
		a1.add(5.5);
		a1.add('a');
		a1.add("akki");
		Object o1 = a1.get(0);
		Integer i1 = (Integer)o1;
		System.out.println(i1);
		Object o2 = a1.get(1);
		Double d1 = (Double)o2;
		System.out.println(d1);
		Object o3 = a1.get(2);
		Character c1 = (Character)o3;
		System.out.println(c1);
		Object o4 = a1.get(3);
		String s1 = (String)o4;
		System.out.println(s1);
	}

}
