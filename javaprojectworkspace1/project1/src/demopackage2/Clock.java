package demopackage2;

public class Clock 
{
	private int hour;
	private int min;
	private int sec;
	public Clock(int hour,int min,int sec)
	{
		if((hour>=0 && hour<=23)&&(min>=0 && min<=59)&&(sec>=0 && sec<=59))
		{
			this.hour = hour;
			this.min = min;
			this.sec = sec;
		}
		else
		{
			//throw exception
			System.out.println("Invalid Time");
		}
	}
	@Override
	public String toString() 
	{
		return "Clock [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}
	public boolean equals(Object o1)
	{
		Clock c1 = (Clock)o1;
		return ((this.hour==c1.hour)&&(this.min==c1.min)&&(this.sec==c1.sec));
	}

}
