package initialization.lab1;

public class ColourfulThing {
	
	public enum Colour {RED, BLUE, PURPLE, GREEN, ORANGE, SALMON}
	
	private Colour colour;
	
	public ColourfulThing(Colour colour)
	{
		this.colour = colour;
	}
	
	public Colour getColour()
	{
		return colour;
	}

	
}
