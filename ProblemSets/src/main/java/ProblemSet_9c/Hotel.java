package ProblemSet_9c;

import java.util.ArrayList;

public class Hotel {

	private String name;
	private ArrayList<IGuest> guests;
	
	public Hotel(String name)
	{
		this.name = name;
		this.guests = new ArrayList<>();
	}
	
	
	
	
	
	
	
	
	
	
	public String getName()
	{
		return name;
	}
	
	public String printGuestList()
	{
		StringBuilder sumGuests = new StringBuilder();
		sumGuests.append(this.name + " Hotel\nGuest List\n");
		for (IGuest guests : guests)
		{
			sumGuests.append(guests.toString() + "\n");
		}
		
		
		return sumGuests.toString();
	}
	
	public ArrayList<IGuest> getGuests()
	{
		return guests;
	}
	
	public void addGuest(IGuest guest)
	{
		guests.add(guest);
	}
}
