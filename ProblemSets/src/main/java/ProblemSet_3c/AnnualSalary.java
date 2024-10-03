package ProblemSet_3c;

public class AnnualSalary
{
	private double salary;
	private double tax;

	
	
	public AnnualSalary()
	{
		return;
	}
	
	public double calculateTax()
	{
		
		if (salary <= 12570)
		{
			tax = 0.0;
		}
		
		if (salary > 12570 && salary <= 50270)
		{
			tax = (salary - 12570) * 0.2;
		}
		
		if (salary > 50270 && salary <= 125140)
		{
			tax = (salary - 50270) * 0.4 + (50270 - 12570) * 0.2;
		}
		
		if (salary > 125140)
		{
			tax = (salary - 125140) * 0.45 + (125140 - 50270) * 0.4 + (50270 - 12570) * 0.2;
		}
		
		return tax;
	}
	
	public void setSalary(double inpsalary)
	{
		salary = inpsalary;	
	}
	
	public double getSalary()
	{
		return salary;
	}
}