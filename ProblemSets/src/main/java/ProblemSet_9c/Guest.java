package ProblemSet_9c;

import java.util.ArrayList;

public class Guest {
	
	private String forename;
	private String surname;
	private String address;
	private String telephone;
	private ArrayList<Charge> charges;
	
	public Guest(String forename, String surname, String address, String telephone)
	{
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone = telephone;
		
		charges = new ArrayList<>();
	}
	
	public void addCharge(Service service, double chargeAmount)
	{
		Charge charge = new Charge(service, chargeAmount);
		charges.add(charge);
	}
	
	public double calculateTotalChargeWithoutVAT()
	{
	    int i = 0; 
	    double sum = 0.0;

	    for (i = 0; i < charges.size(); i++)
	    {
	        sum += charges.get(i).getCharge();
	    }

	    return sum;
	}
	
	public double calculateVATChargeAtRate(VATRate rate) {
	    double sum = 0.0;

	    for (Charge charge : charges) {
	        if (charge.getService().getRate() == rate) {
	            sum += charge.calculateVAT();
	        }
	    }

	    return sum;
	}


	public ArrayList<Charge> getCharges()
	{
		return charges;
	}
	
	public String getForename()
	{
		return forename;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public String getTelephone()
	{
		return telephone;
	}

	public double calculateTotalChargeIncVat()
	{
	    int i = 0; 
	    double sum = 0.0;

	    for (i = 0; i < charges.size(); i++)
	    {
	        sum += charges.get(i).calculateVAT() + charges.get(i).getCharge();
	    }

	    return sum;
	}
	
	@Override
	public String toString()
	{
		return (this.getForename() + " " + this.getSurname() + ", " + this.getAddress() + ", " + this.getTelephone());
	}
	
}
