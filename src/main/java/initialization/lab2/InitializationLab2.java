package initialization.lab2;

import java.util.Random;

import initialization.lab1.ColourfulThing;
import initialization.lab1.Colour;

public class InitializationLab2 
{
	
	public static void main(String[] args)
	{
		// Have not used the main method to demonstrate how the ThingContainer works.
		// This is because there is an extensive testing file.
		
		ColourfulThing colourfulThing1 = new ColourfulThing(InitializationLab2.getRandomColour());
		ColourfulThing colourfulThing2 = new ColourfulThing(InitializationLab2.getRandomColour());
		ColourfulThing colourfulThing3 = new ColourfulThing(InitializationLab2.getRandomColour());
		
		
		ThingContainer thingContainer = new ThingContainer(3);
		thingContainer.addToThingContainer(colourfulThing1);
		thingContainer.addToThingContainer(colourfulThing2);
		thingContainer.addToThingContainer(colourfulThing3);	
	}
	
   
   public static Colour getRandomColour() 
   {
       Random random = new Random();
       return Colour.values()[random.nextInt(Colour.values().length)];
   }
	
}
