package initialization.lab1;

import org.junit.Test;

import org.junit.Assert;

public class InitializationLab1Test 
{

	@Test
	public void getColorTest()
	{
		//:Given
		ColourfulThing colourfulThing = new ColourfulThing(Colour.RED);
		Colour expected = Colour.RED;
		
		//:When
		Colour actual = colourfulThing.getColour();
		
		//:Then
		Assert.assertEquals(expected, actual);
	}
	
}
