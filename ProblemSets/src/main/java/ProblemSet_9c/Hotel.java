package ProblemSet_9c;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<IGuest> guests;

    public Hotel(String name) {
        this.name = name;
        guests = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String printGuestList() {
        StringBuilder guestList = new StringBuilder();
        guestList.append(name).append(" Hotel\nGuest List\n");
        for (IGuest guest : guests) {
            guestList.append(guest.toString()).append("\n");
        }
        return guestList.toString();
    }

    public ArrayList<IGuest> getGuests() {
        return guests;
    }

    public void addGuest(IGuest guest) {
        guests.add(guest);
    }
}
