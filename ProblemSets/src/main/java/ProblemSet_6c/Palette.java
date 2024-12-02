package ProblemSet_6c;

import java.util.ArrayList;
import java.util.Arrays;

public class Palette
{
    private ArrayList<P_COLOUR> colours;
    private boolean first;

    public Palette()
    {
        colours = new ArrayList<>();
    }

    public Palette(P_COLOUR[] colours)
    {
        this.colours = new ArrayList<>(Arrays.asList(colours));
        if (colours.length > 3)
        {
        	throw new IllegalArgumentException("Maximum of 3 Colours permitted in a Palette.");
        }
    }

    public void addColour(P_COLOUR colour)
    {
        if (colour != null)
        {
            if (colours.size() < 3)
            {
                colours.add(colour);
            }
            else
            {
                throw new IllegalStateException("Cannot add more than 3 colours.");
            }
        }
    }

    public String getColours()
    {
        StringBuilder result = new StringBuilder();
        first = true;

        if (colours.isEmpty())
        {
            return "No colours added";
        }

        for (P_COLOUR colour : colours)
        {
            if (colour != null)
            {
                if (!first)
                {
                    result.append(", ");
                }
                else
                {
                    first = false;
                }

                result.append(colour.name());
            }
        }

        return result.toString();
    }

    public String mixColours() {
        colours.removeIf(colour -> colour == null);
        
        switch (colours.size()) {
            case 1:
                return colours.get(0).name();
            case 2:
                P_COLOUR first = colours.get(0);
                P_COLOUR second = colours.get(1);

                if (first == P_COLOUR.RED) {
                    if (second == P_COLOUR.YELLOW) {
                        return "ORANGE";
                    } else if (second == P_COLOUR.BLUE) {
                        return "PURPLE";
                    }
                } else if (first == P_COLOUR.BLUE) {
                    if (second == P_COLOUR.YELLOW) {
                        return "GREEN";
                    } else if (second == P_COLOUR.RED) {
                        return "PURPLE";
                    }
                } else if (first == P_COLOUR.YELLOW) {
                    if (second == P_COLOUR.RED) {
                        return "ORANGE";
                    } else if (second == P_COLOUR.BLUE) {
                        return "GREEN";
                    }
                }
                break;
            case 3:
                return "BLACK";
        }
        return "";
    }



    public String display()
    {
        StringBuilder displayString = new StringBuilder();
        displayString.append(getColours()).append(" = ").append(mixColours());
        return displayString.toString();
    }
}
