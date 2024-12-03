package ProblemSet_8c;

public class Person
{
	private String forename;
	private String surname;
	private int age;
	
	public Person(String forename, String surname, int age)
	{
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}
	
	public String getForename()
	{
		return forename;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return (this.forename + " " + this.surname + " (" + this.age + ")");
	}
}
