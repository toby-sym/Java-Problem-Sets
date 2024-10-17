package ProblemSet_5b;

public class GasBill
{
	private String accountNumber;
	private double amountDue;
	private Customer customer;
	
	private String variString;
	
	public GasBill(String accountNumber, double amountDue, Customer customer)
	{
		this.accountNumber = accountNumber;
		this.amountDue = amountDue;
		this.customer = customer;
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getCustomer()
	{
		return (this.customer.getName() + ". " + this.customer.getSurname());
	}

	public boolean checkAccountAccuracy(String accountNumber)
	{
		if (accountNumber.charAt(0) == 'G')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String displayAccountDetails()
	{
		variString = "";
		if (this.checkAccountAccuracy(accountNumber) == true)
		{
			variString = accountNumber; 
		}
		else if (this.checkAccountAccuracy(accountNumber) == false)
		{
			variString = "Invalid Account";
		}
		
		return ("Gas Bill\n" + " Account Number:" + variString + "\n" + " Customer:" + this.getCustomer() + "\n" + " Amount due:£" +  String.format("%.2f", amountDue));
	}
}