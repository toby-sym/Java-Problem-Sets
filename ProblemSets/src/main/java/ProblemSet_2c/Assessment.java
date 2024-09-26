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
		return courseweight;
	}
}