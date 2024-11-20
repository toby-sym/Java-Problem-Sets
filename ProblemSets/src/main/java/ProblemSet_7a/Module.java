package ProblemSet_7a;

import java.util.regex.Pattern;

public class Module
{
	private String name;
	private static final String nameValidationPattern = "[A-Z]{3}[0-9]{4}$";
	
    private Module(String name)
    {
        this.name = name;
    }
	
	public createModule(String Name)
	{
		if (Pattern.matches(nameValidationPattern, name) == true)
		{
			return new Module(name);
		}
		else
		{
			return null;
		}
	}
	
	public String getName()
	{
		return name;
	}
}
