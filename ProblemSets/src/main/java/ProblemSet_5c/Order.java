package ProblemSet_5c;

import java.util.ArrayList;

public class Order
{
	private Customer customer;
	private ArrayList<Pizza> pizzas;
	
	private double cumTotal;
	
	public Order() {
	    pizzas = new ArrayList<>();
	}

	public Order(Customer customer) {
	    this.customer = customer;
	    pizzas = new ArrayList<>();
	}
	
	public void addPizza(Pizza pizza)
	{
		pizzas.add(pizza);
	}
	
	public double calculateTotal()
	{
		cumTotal = 0;
		for (int i = 0; i < pizzas.size(); i++)
		{
			cumTotal += pizzas.get(i).calculateCost();
		}
		return cumTotal;
	}
	
	public String printReceipt()
	{
		return ("Customer: " + customer.getName() + ". " + customer.getSurname() + "\n" + "Number of Pizzas: " + pizzas.size() + "\n" + "Total Cost: " + this.calculateTotal());
	}
}

