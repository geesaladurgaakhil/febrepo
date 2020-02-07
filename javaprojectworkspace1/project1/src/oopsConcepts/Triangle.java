package oopsConcepts;
import oopsConcepts.Shape;
public class Triangle extends Shape
{
	int b;
	int h;
	public Triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public void getArea()
	{
		System.out.println(0.5*this.b*this.h);
	}

}
