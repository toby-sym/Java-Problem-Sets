package ProblemSet_2c;

public class Module
{
	private Assessment assessment1;
	private Assessment assessment2;
	private Assessment assessment3;
	private double val1;
	private double val2;
	private double val3;
	
	public Module(Assessment assessment1, Assessment assessment2, Assessment assessment3)
	{
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
	}

	public double calculateAverage() 
	{
		return assessment1.getMark() + assessment2.getMark() + assessment3.getMark();
	}
	
	public String toString()
	{
		return "COM1027 (" + (((assessment1.getMark() + assessment2.getMark() + assessment3.getMark())) + "%)");
	}
}