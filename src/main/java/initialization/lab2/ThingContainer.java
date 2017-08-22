package initialization.lab2;
import initialization.lab1.ColourfulThing;
import initialization.lab1.Colour;

public class ThingContainer 
{
	private Integer size;
	private ColourfulThing[] containerArray;
	
	
	public ThingContainer(Integer size)
	{
		this.size = size;
		this.containerArray = new ColourfulThing[size]; // empty array of length <size>
	}
	
	public ThingContainer(ColourfulThing[] colourfulThingArray)
	{
		this.containerArray = colourfulThingArray; 
	}
	
	public void addToThingContainer(ColourfulThing newColourfulThing)
	{
	
	for(int x=0; x<containerArray.length; x++)
	{
		if(containerArray[x]==null)
		{
		   containerArray[x] = newColourfulThing;
		   break;
		}
		
		else if (x == (containerArray.length - 1))
		{
			System.out.print("ThingContainer is full");
		}
	}
	
	}
	
		
	public String printStrings()
	{
		String response = "*** Output ***";
		
		for(int x=0; x<containerArray.length; x++)
		{
			if(containerArray[x]!=null)
			{
			   response += "\n" + containerArray[x].getColour();
			}
		}
		
		return response;
	}
	
	public String pop()
	{
		String response = "";
		
		for(int x=containerArray.length-1; x>=0; x--)
		{
			if(containerArray[x]!=null)
			{
			    response += containerArray[x].getColour();
			    containerArray[x] = null;
			    break;
			}
		}
		return response;
	}
	
	
	public Colour remove(Colour colour)
	{
		for(int x=0; x<containerArray.length; x++)
		{
			if(containerArray[x].getColour().equals(colour))
			{
			    Colour response = containerArray[x].getColour();
			    
			    for(int i=x; i<containerArray.length-1; i++)
			    {
			    	containerArray[i] = containerArray[i+1];
			    }
			    
			    containerArray[containerArray.length-1] = null;
			    return response;
			}
			
		}
		
		return null;
	}
	
	
	public String remove(ColourfulThing colourfulThing)
	{
		for(int x=0; x<containerArray.length; x++)
		{
			if(containerArray[x]==colourfulThing)
			{
			    String response = containerArray[x].toString();
			    
			    for(int i=x; i<containerArray.length-1; i++)
			    {
			    	containerArray[i] = containerArray[i+1];
			    }
			    
			    containerArray[containerArray.length-1] = null;
			    
			    return response;
			}
		}

		return null;
	}
	
	
	public int returnLength()
	{
		return this.containerArray.length;
	}
	
	public ColourfulThing returnIndex(int n)
	{
		return this.containerArray[n];
	}

	
}
