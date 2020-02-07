package revisionpackage;

public class Inher 
{
	public static void main(String[] args)
	{
		/*A a1 = (A)new B(7,8,6.5,true);
		System.out.println(a1.a);
		System.out.println(a1.b);
		System.out.println(a1.z);
		Inheritance h1 =(Inheritance)a1;
		System.out.println(h1.a);
		System.out.println(h1.b);*/  //upcasting//
		Inheritance e1 = new Inheritance(2,3);
		A a1 = new A(4,5,2.5);
		B b1 = new B(7,8,6.5,true);
		System.out.print(e1.a);
		System.out.println(e1.b);
		System.out.print(a1.a);
		System.out.print(a1.b);
		System.out.println(a1.z);
		System.out.print(b1.a);
		System.out.print(b1.b);
		System.out.print(b1.z);
		System.out.print(b1.x);
	}

}
