package initialization.lab1;

public class InitializationLab1 {
	
	public static void main(String[] args)
	{
		
		BoringThing boringThing1 = new BoringThing();
		BoringThing boringThing2 = new BoringThing();
		BoringThing boringThing3 = new BoringThing();
		BoringThing boringThing4 = new BoringThing();
		BoringThing boringThing5 = new BoringThing();
		
		ColourfulThing colourfulThing1 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing2 = new ColourfulThing(Colour.GREEN);
		ColourfulThing colourfulThing3 = new ColourfulThing(Colour.ORANGE);
		ColourfulThing colourfulThing4 = new ColourfulThing(Colour.SALMON);
		ColourfulThing colourfulThing5 = new ColourfulThing(Colour.PURPLE);
		
		String response = colourfulThing1.getColour() + ", "
						+ colourfulThing2.getColour() + ", "
						+ colourfulThing3.getColour() + ", "
						+ colourfulThing4.getColour() + ", "
						+ colourfulThing5.getColour();
		
		System.out.print(response);
		
	}
	
}
