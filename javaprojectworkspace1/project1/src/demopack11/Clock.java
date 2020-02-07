package demopack11;

public class Clock 
{
	int hour;
	int min;
	int sec;
	public Clock(int h,int m,int s)
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
	public String toString() {
		return "Clock [hour=" + hour + ", min=" + min + ", sec=" + sec + "]";
	}
}
