package demopackage2;

public class Light {
	String colour;
	String type;

	public Light(String colour, String type) {
		this.colour = colour;
		this.type = type;
	}

	public void lighting() {
		System.out.println(this.colour + " " + this.type + " light glows in the room");
	}

}
