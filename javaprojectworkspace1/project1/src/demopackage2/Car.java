package demopackage2;

public class Car 
{
	String bn;
	int topsp;
	double mi;
	String colour;
	public Car(String bn, int topsp, double mi, String colour)
	{
		this.bn=bn;
		this.topsp=topsp;
		this.mi=mi;
		this.colour=colour;
	}
	public String toString() 
	{
		return this.bn+" hava a "+this.topsp+" topSpeed "+" and gives a milage of "+this.mi+" and car colour is "+this.colour;
	}
	public boolean equals(Object o1)
	{
		Car c1=(Car)o1;
		return((this.bn == c1.bn)&&(this.topsp==c1.topsp)&&(this.mi==c1.mi)&&(this.colour==c1.colour));
	}

}
