package oopsConcepts;
import oopsConcepts.Shape;
public class Rectangle extends Shape
{
	int l;
	int w;
	public Rectangle(int l,int w)
	{
		this.l=l;
		this.w=w;
	}
	public void getArea()
	{
		System.out.println(this.l*this.w);
	}

}
