package ProblemSet_7a;

import java.util.regex.*;

public class Module
{
	private String name;
	private String nameValidation = "[C,O,M]{3}[0-9]{4}$";
	
	
	
    public Module(String name)
    {
        
    	this.name = name;
    }
    
	public String getName()
	{
		System.out.println(name.matches(nameValidation));
		
		if (!name.matches(nameValidation))
		{
			return "Error";
		}
		else
		{
			return name;
		}
	}
}
