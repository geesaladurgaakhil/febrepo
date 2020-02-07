package demopackage2;

public class ShowRoom 
{
	public static void main(String[] args)
	{
		Car c1= new Car("audi",200,50.5,"red");
		System.out.println(c1);
		Car c2= new Car("RR",300,50.5,"Blue");
		System.out.println(c2);
		boolean b1 = c1.equals(c2);  //equals to method 
		System.out.println(b1);
	}
	
 
}
