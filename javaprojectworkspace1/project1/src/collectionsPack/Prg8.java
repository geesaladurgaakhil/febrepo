package collectionsPack;

import java.util.ArrayList;
import java.util.Scanner;

public class Prg8 
{
	public static void main(String[] args)
	{
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the double objects...");
		double a= n.nextDouble();
		double b= n.nextDouble();
		double c = n.nextDouble();
		double d = n.nextDouble();
		ArrayList a1 = new ArrayList();
		a1.add(a);
		a1.add(b);
		a1.add(c);
		a1.add(d);
		System.out.println("Before inserting the elements..");
		System.out.println(a1);
		System.out.println("Enter element to insert and location to be inserted...");
		int x=n.nextInt();
		double y=n.nextDouble();
		a1.add(x, y);
		System.out.println("after inserting the elements..");
		System.out.println(a1);
		
	}

}
