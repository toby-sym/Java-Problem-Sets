package ProblemSet_8a;

public class Customer
{
	private String name;
	private String surname;
	private final String nameValidation = "^[A-Z][a-z]*$";
	
	
	
	public Customer(String name, String surname)
	{
		if (name.matches(nameValidation) && surname.matches(nameValidation))
		{
			this.name = name;
			this.surname = surname;
		}
		else
		{
			throw new IllegalArgumentException();
	    }
	}
	
	public char getName()
	{
		return (name.charAt(0));
	}
	
	public void setSurname(String surname)
	{
		this.surname = surname;
	}

	public String getSurname() 
	{
		return surname;
	}
	
	public boolean validateInfo(String string)
	{
		if (string.matches(nameValidation))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return (this.getName() + ". " + this.getSurname());
	}
}
