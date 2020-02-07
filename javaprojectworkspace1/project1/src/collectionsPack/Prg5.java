package collectionsPack;

import java.util.Vector;

public class Prg5 
{
	public static void main(String[] args)
	{
		Vector v1 = new Vector();
		v1.add("srinivas");
		v1.add("kumari");
		v1.add("Akhil");
		v1.add("harish");
		for(int i=0; i<=v1.size()-1; i++)
		{
			Object o = v1.get(i);
			String s = (String)o;
			System.out.println(s);
		}
	}

}
