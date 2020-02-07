package demopackage2;

public class Room 
{
	Fan f;
	Light l;
	public Room(Fan f,Light l)
	{
		this.f=f;
		this.l=l;
	}
	public void electricApliences()
	{
		f.rotate();
		l.lighting();
	}

}
