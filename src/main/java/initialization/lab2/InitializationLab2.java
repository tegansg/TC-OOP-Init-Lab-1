package initialization.lab2;

import java.util.Random;

import initialization.lab1.ColourfulThing;
import initialization.lab1.ColourfulThing.Colour;

public class InitializationLab2 {
	
	// private static final Random RND = new Random();
	
	public static void main(String[] args)
	{
		// three ThingContainers with randomly generated ColorfulThings
		Colour colour1 = InitializationLab2.getRandomColour();
		Colour colour2 = InitializationLab2.getRandomColour();
		Colour colour3 = InitializationLab2.getRandomColour();
		
		
//		ColourfulThing colourThing1 = new ColourfulThing(colour1);
//		ColourfulThing colourThing2 = new ColourfulThing(colour2);
//		ColourfulThing colourThing3 = new ColourfulThing(colour3);
		
		ThingContainer thingContainer = new ThingContainer(3);
		thingContainer.addToThingContainer(colour1);
		thingContainer.addToThingContainer(colour2);
		thingContainer.addToThingContainer(colour3);
		

	
	}
	
   
   public static Colour getRandomColour() 
   {
       Random random = new Random();
       return Colour.values()[random.nextInt(Colour.values().length)];
   }
	
}
