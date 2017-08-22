package initialization.lab2;

import org.junit.Test;

import initialization.lab1.ColourfulThing;
import initialization.lab1.Colour;

import org.junit.Assert;

public class ThingContainerTest 
{

	@Test
	public void constructorTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(6);
		Integer expected = 6;
		
		//:When
		Integer actual = thingContainer.returnLength();
			
		//:Then
		Assert.assertEquals(actual, expected);
	}
	
	@Test
	public void colourfulThingArrayTest()
	{
		//:Given
		ColourfulThing colourfulThing1 = new ColourfulThing(Colour.GREEN);
		ColourfulThing colourfulThing2 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing3 = new ColourfulThing(Colour.SALMON);
		
		ColourfulThing[] colourfulThingArray = {colourfulThing1, colourfulThing2, colourfulThing3};	
		
		ThingContainer thingContainer = new ThingContainer(colourfulThingArray);
		
		//:When
		String expected = "*** Output ***"
				+ "\nGREEN"
				+ "\nBLUE"
				+ "\nSALMON";
				
		String actual = thingContainer.printStrings();
		
		//:Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void addToThingContainerTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		
		ColourfulThing a = new ColourfulThing(Colour.GREEN); thingContainer.addToThingContainer(a);
		ColourfulThing b = new ColourfulThing(Colour.BLUE); thingContainer.addToThingContainer(b);
		ColourfulThing c = new ColourfulThing(Colour.SALMON); thingContainer.addToThingContainer(c);
		
		//:When
		ColourfulThing actual1 = thingContainer.returnIndex(0);
		ColourfulThing expected1 = a;
		
		ColourfulThing actual2 = thingContainer.returnIndex(1);
		ColourfulThing expected2 = b;
		
		ColourfulThing actual3 = thingContainer.returnIndex(2);
		ColourfulThing expected3 = c;
		
		ColourfulThing actual4 = thingContainer.returnIndex(3);
		ColourfulThing expected4 = null;
		
		//:Then
		Assert.assertEquals(actual1, expected1);
		Assert.assertEquals(actual2, expected2);
		Assert.assertEquals(actual3, expected3);
		Assert.assertEquals(actual4, expected4);
	}

	
	@Test
	public void printStringsTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(3);
		
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		
		String expected = "*** Output ***"
						+ "\nGREEN"
						+ "\nBLUE"
						+ "\nSALMON";
		
		//:When
		String actual = thingContainer.printStrings();
		
		
		//:Then
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void popTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(3);
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		
		String expected = "SALMON";
		
		//:When
		String actual = thingContainer.pop();
		
		//:Then
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void popNullTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(3);
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		Colour expected = null;
		
		//:When
		thingContainer.pop();
		
		ColourfulThing actual = thingContainer.returnIndex(2);
		
		//:Then
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void removeColourTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		
		Colour expected = Colour.BLUE;
		
		//:When
		Colour actual = thingContainer.remove(Colour.BLUE);
		
		//:Then
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void removeColourNullTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(3);
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		Colour expected = null;
		
		//:When
		Colour actual = thingContainer.remove(Colour.RED);
		
		//:Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void removeColourAccurateTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		thingContainer.addToThingContainer(new ColourfulThing(Colour.GREEN));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.SALMON));
		thingContainer.addToThingContainer(new ColourfulThing(Colour.BLUE));
		
		String expected = "*** Output ***"
						+ "\nGREEN"
						+ "\nSALMON"
						+ "\nBLUE"
						+ "\nRED";
		
		//:When
		thingContainer.remove(Colour.BLUE);
		
		thingContainer.addToThingContainer(new ColourfulThing(Colour.RED));
		String actual = thingContainer.printStrings();
		
		//:Then
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test
	public void removeColourfulThingTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		
		ColourfulThing colourfulThing1 = new ColourfulThing(Colour.GREEN);
		ColourfulThing colourfulThing2 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing3 = new ColourfulThing(Colour.SALMON);
		ColourfulThing colourfulThing4 = new ColourfulThing(Colour.BLUE);
		
		thingContainer.addToThingContainer(colourfulThing1);
		thingContainer.addToThingContainer(colourfulThing2);
		thingContainer.addToThingContainer(colourfulThing3);
		
		String expected = colourfulThing3.toString();
		
		//:When
		String actual = thingContainer.remove(colourfulThing3);
		
		//:Then
		Assert.assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void removeColourfulThingNullTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		
		ColourfulThing colourfulThing1 = new ColourfulThing(Colour.GREEN);
		ColourfulThing colourfulThing2 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing3 = new ColourfulThing(Colour.SALMON);
		ColourfulThing colourfulThing4 = new ColourfulThing(Colour.BLUE);
		
		thingContainer.addToThingContainer(colourfulThing1);
		thingContainer.addToThingContainer(colourfulThing2);
		thingContainer.addToThingContainer(colourfulThing3);
		
		String expected = null;
		
		//:When
		String actual = thingContainer.remove(colourfulThing4);
		
		//:Then
		Assert.assertEquals(expected, actual);	
	}
	
	
	@Test
	public void removeColourfulThingAccurateTest()
	{
		//:Given
		ThingContainer thingContainer = new ThingContainer(4);
		
		ColourfulThing colourfulThing1 = new ColourfulThing(Colour.GREEN);
		ColourfulThing colourfulThing2 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing3 = new ColourfulThing(Colour.SALMON);
		ColourfulThing colourfulThing4 = new ColourfulThing(Colour.BLUE);
		ColourfulThing colourfulThing5 = new ColourfulThing(Colour.RED);
		
		thingContainer.addToThingContainer(colourfulThing1);
		thingContainer.addToThingContainer(colourfulThing2);
		thingContainer.addToThingContainer(colourfulThing3);
		thingContainer.addToThingContainer(colourfulThing4);
		
		String expected = "*** Output ***"
						+ "\nGREEN"
						+ "\nSALMON"
						+ "\nBLUE"
						+ "\nRED";
		
		//:When
		thingContainer.remove(Colour.BLUE);
		thingContainer.addToThingContainer(colourfulThing5);
		
		String actual = thingContainer.printStrings();
		
		//:Then
		Assert.assertEquals(expected, actual);
	}
	
	
	
}
