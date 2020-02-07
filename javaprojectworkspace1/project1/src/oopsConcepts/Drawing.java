package oopsConcepts;

public class Drawing 
{
	public static void main(String[] args)
	/*{
		Drawing o1 = new Drawing();              // Run time polymorphysm example..//
		o1.displaArea(new Circle(10));
		o1.displaArea(new Circle(12));
		o1.displaArea(new Rectangle(12,12));
		o1.displaArea(new Rectangle(11,11));
		o1.displaArea(new Triangle(5,6));
		o1.displaArea(new Triangle(5,10));
	}
	public void displaArea(Shape s1)
	{
		s1.getArea();
	}*/
	
	{
		displaArea(new Circle(10));
		displaArea(new Circle(12));
		displaArea(new Rectangle(12,12));
		displaArea(new Rectangle(11,11));
		displaArea(new Triangle(5,6));
		displaArea(new Triangle(5,10));
	}
	
	public static void displaArea(Shape s1)
	{
		s1.getArea();
	}

}
