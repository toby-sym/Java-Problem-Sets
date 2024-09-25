package ProblemSet_2a;

public class Student
{
	private String firstName;
	private String lastName;
	private int age;
	
	public Student(String inpfirstName, String inplastName, int inpage)
	{
		firstName = inpfirstName;
		lastName = inplastName;
		age = inpage;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getFullname()
	{
		return firstName + " " + lastName;
	}
	
	public void setForename(String newfirstName)
	{
		firstName = newfirstName;
	}
	
	public void setSurname(String newlastName)
	{
		lastName = newlastName;
	}
	
	
	
	
}