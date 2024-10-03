package ProblemSet_3c;

public class Employee
{
	private int employeeID;
	private String employeeForename;
	private String employeeSurname;
	private AnnualSalary employeeSalary;
	private Position employeePosition;
	
	
	public Employee(int employeeID, String employeeForename, String employeeSurname, AnnualSalary employeeSalary, Position employeePosition)
	{
		this.employeeID = employeeID;
		this.employeeForename = employeeForename;
		this.employeeSurname = employeeSurname;
		this.employeeSalary = employeeSalary;
		this.employeePosition = employeePosition;
	}
	
	public int getId()
	{
		return employeeID;
	}
	
	public String getForename()
	{
		return employeeForename;
	}
	
	public String getSurname()
	{
		return employeeSurname;
	}
	
	public int getSalary()
	{
		return (int) employeeSalary.getSalary();
	}
	
	public String getPositionName()
	{
		return (String) employeePosition.getRoleName();
	}
	
	public boolean eligibleForBonus()
	{
		if (employeeSalary.getSalary() > 40000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		if (this.eligibleForBonus() == true)
		{
			return (employeeSurname + ", " + employeeForename + " (" + employeeID + "): " + employeePosition.getRoleName() + " at £" + employeeSalary.getSalary() +" (£" + employeeSalary.calculateTax() + " tax) and is eligible for bonus.");
		}
		else
		{
			return (employeeSurname + ", " + employeeForename + " (" + employeeID + "): " + employeePosition.getRoleName() + " at £" + employeeSalary.getSalary() +" (£" + employeeSalary.calculateTax() + " tax) and is not eligible for bonus.");

		}
	}
}