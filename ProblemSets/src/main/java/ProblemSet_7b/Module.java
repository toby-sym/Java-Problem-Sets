package ProblemSet_7b;

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
		if (!name.matches(nameValidation))
		{
			return "Error";
		}
		else
		{
			return name;
		}
	}
	
	public String toString()
	{
		return name;
	}
}
