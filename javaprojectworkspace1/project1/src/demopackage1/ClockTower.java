package demopackage1;

public class ClockTower 
{
	String loc;
	Clock c;
	public ClockTower(String loc,Clock c)
	{
		this.loc = loc;
		this.c = c;
	}
	public void showTime() 
	{
		c.time();
	}
}
