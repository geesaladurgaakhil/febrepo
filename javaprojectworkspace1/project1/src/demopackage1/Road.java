package demopackage1;

public class Road 
{
	public static void main(String[] args)
	{
		ClockTower ct = new ClockTower("Hyderabad",new Clock(11,23,50));
		ct.showTime();
	}

}
