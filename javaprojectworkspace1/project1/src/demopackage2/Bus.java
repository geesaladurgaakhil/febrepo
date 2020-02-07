package demopackage2;

public class Bus 
{
	String busOperatorName;
	String startPoint;
	String destinationPoint;
	int busNumber;
	public Bus(String busOperatorName,String startPoint,String destinationPoint,int busNumber)
	{
		this.busOperatorName = busOperatorName;
		this.startPoint=startPoint;
		this.destinationPoint=destinationPoint;
		this.busNumber=busNumber;
	}
	public String toString()
	{
		return"your bus number is "+this.busNumber+" busoperator name "+this.busOperatorName+" starts from "+this.startPoint+" ends@ "+this.destinationPoint;
	}
}
