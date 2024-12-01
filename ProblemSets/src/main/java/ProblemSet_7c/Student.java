package ProblemSet_7c;

import java.util.ArrayList;

public class Student
{
	private String name;
	private String nameValidation = "^[A-Z][a-z]+\\s[A-Z][a-z]+$";
	private String urn;
	private String urnValidation = "^\\d{5}$";
	private ArrayList<Module> moduleList;
	
	public Student(String name, String urn)
	{
		this.name = name;
		this.urn = urn;
		this.moduleList = new ArrayList<>();	
	}
	
	public void addModuleList(Module module)
	{
		moduleList.add(module);
	}
	
	public String printModules()
	{
		StringBuilder moduleString = new StringBuilder();
		for (int i = 0; i < moduleList.size(); i++)
			{
				if (!(moduleList.get(i) == null))
				{
				if (i == 0)
				{
					moduleString.append(moduleList.get(i));
				}
				else
				{
					moduleString.append(", " + moduleList.get(i));
				}
				}
			}
		
		return moduleString.toString();
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
	
	public int getUrn()
	{ 		
		if (!urn.matches(urnValidation))
		{
			return 0;
		}
		else
		{
			return Integer.parseInt(urn);
		}
	}
}
