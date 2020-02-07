package demopackage2;

public class Fan 
{
	String bn;
	int speed;
	public Fan(String bn,int speed)
	{
		this.bn=bn;
		this.speed=speed;
	}
	public void rotate()
	{
		System.out.println(this.bn+" Fan rotates with "+this.speed+" and");
	}
}
