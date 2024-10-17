package ProblemSet_4c;

public class Module
{
	private String moduleName;
	private double moduleAverage;
	
	public Module(String moduleName, double moduleAverage)
	{
		this.moduleName = moduleName;
		this.moduleAverage = moduleAverage;
	}
	
	public String getCode()
	{
		return moduleName;
	}
	
	public double getAverage()
	{
		return moduleAverage;
	}
}