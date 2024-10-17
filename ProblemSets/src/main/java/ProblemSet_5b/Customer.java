package ProblemSet_5b;

public class Customer
{
	private String firstName;
	private String lastName;
	
	public Customer(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return (firstName.charAt(0) + ". " + lastName);
	}
	
	public char getName()
	{
		return firstName.charAt(0);
	}
	
	public String getSurname()
	{
		return lastName;
	}
}