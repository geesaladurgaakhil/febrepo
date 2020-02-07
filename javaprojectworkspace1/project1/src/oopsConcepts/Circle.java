package oopsConcepts;
import oopsConcepts.Shape;
public class Circle extends Shape
{
	final static double pi = 3.14;
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	public void getArea()
	{
		System.out.println(pi*this.r*this.r);
	}

}
