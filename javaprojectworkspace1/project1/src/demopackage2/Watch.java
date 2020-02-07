package demopackage2;

public class Watch 
{
	int hour;
	int min;
	int sec;
	public Watch(int hour, int min, int sec) {
		super();
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	@Override
	public String toString() 
	{
		if(sec==0)
		{
			return "time--->"+this.hour+":"+this.min;
		}
		else
		{
			return "time--->"+this.hour+":"+this.min+":"+this.sec;
		}
	}

}
