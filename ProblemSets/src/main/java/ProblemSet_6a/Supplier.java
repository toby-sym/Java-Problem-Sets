package ProblemSet_6a;

public class Supplier
{
	private String supplierName;
	private String phoneNumber;
	
	public Supplier(String supplierName, String phoneNumber)
	{
		if (!phoneNumber.matches("^0\\d{10}$")) {
		    throw new IllegalArgumentException("Phone number must start with '0' and be 11 digits long.");
		}
		
		this.supplierName = supplierName;
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhone()
	{
		return phoneNumber;
	}
	
	public String getName()
	{
		return supplierName;
	}
}