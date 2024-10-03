package ProblemSet_3b;

public class AnnualSalary
{
	private int salary;
	
	public AnnualSalary()
	{
		return;
	}
	
	public double calculateTax()
	{
		if (salary <=12570)
		{
			return 0.0;
		}
		
		else if (salary <= 50270)
		{
			return ((salary-12570) * 0.80 + 12570);
		}
		return salary;
	}
	
	public void setSalary(int inpsalary)
	{
		salary = inpsalary;
	}
	
	public int getSalary()
	{
		return salary;
	}
}