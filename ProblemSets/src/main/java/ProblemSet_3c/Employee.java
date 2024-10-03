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
	
	public int getID()
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
	
	public AnnualSalary getSalary()
	{
		return employeeSalary;
	}
	
	public Position getPositionName()
	{
		return employeePosition;
	}
	
	public String toString()
	{
		return (employeeSurname + ", " + employeeForename + " (" + employeeID + "): " + employeePosition.getRoleName() + " at £" + employeeSalary.getSalary() +" (£" + employeeSalary.calculateTax() + " tax) and is not eligible for bonus.");
	}
}