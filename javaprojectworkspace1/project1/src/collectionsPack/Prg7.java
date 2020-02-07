package collectionsPack;

import java.util.ArrayList;

public class Prg7 
{
	public static void main(String[] args)
	{
		ArrayList a1 = new ArrayList();
		a1.add(56);
		a1.add(85);
		a1.add(52);
		a1.add(32);
		a1.add(99);
		System.out.println(a1);
		a1.add(1, 100);   // 1st argument is index number and 2nd argument is the number to be added
		System.out.println(a1);
		a1.set(1, 101);   // 1st argument is index number and 2nd argument is number to be replaced..
		System.out.println(a1);
		a1.remove(1);     // removes the 1index value..
		System.out.println(a1);
		a1.clear();  // clear entire array..
		System.out.println(a1);
	}

}
