package demopackage2;

public class House 
{
	public static void main(String[] args)
	{
		Room r1 = new Room(new Fan("Usha",5),new Light("yellow","compact"));
		r1.electricApliences();
	}

}
