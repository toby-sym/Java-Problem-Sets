package ProblemSet_5c;

public class Pizza
{
	private String[] toppings;
	private String output;
	private double cost;
	
	public Pizza()
	{
		this.toppings = new String[0];
	}
	
	public void addToppings(String[] toppings)
	{
		this.toppings = toppings;
	}
	
	public String printToppings()
	{
		output = "";
		for (int i = 0; i < toppings.length; i++)
		{
			if (i == 0)
			{
				output += toppings[i];
			}
			else
			{
				output += "," + toppings[i];
			}
		}
		return output;
	}
	
	public double calculateCost()
	{
		switch (toppings.length)
		{
		  case 0:
		    cost = 0;
		    break;
		  case 1:
			cost = 9.99;
		    break;
		  case 2:
		  case 3:
			cost = 10.99;
		    break;
		  case 4:
		  case 5:
			cost = 11.99;
		    break;
		  case 6:
			cost = 12.99;
			break;
		  case 7:
			cost = 13.99;
			break;
		  case 8:
			cost = 14.99;
			break;
		  case 9:
			cost = 15.99;
			break;
		  case 10:
			cost = 14.99;
			break;
		}
		return cost;
	}
	
	
}
