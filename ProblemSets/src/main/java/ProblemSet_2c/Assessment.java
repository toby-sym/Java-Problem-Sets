package ProblemSet_2c;

public class Assessment
{
	private String testname;
	private double courseweight;
	
	public Assessment(String testname, double courseweight)
	{
		this.testname = testname;
		this.courseweight = courseweight;
	}
	
	public String getName()
	{
		return testname;
	}
	
	public double getMark()
	{
		if (testname == "Labs1")
			{
				courseweight = courseweight * 0.2;
			}
		
		if (testname == "Labs2")
			{
				courseweight = courseweight * 0.2;
			}
		
		if (testname == "Coursework")
			{
				courseweight = courseweight * 0.6;
			}
		
		return courseweight;
	}
}