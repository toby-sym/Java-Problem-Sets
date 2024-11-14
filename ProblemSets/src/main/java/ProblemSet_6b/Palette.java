package ProblemSet_6b;

import java.util.ArrayList;
import java.util.Arrays;

public class Palette
{
	private ArrayList<P_COLOUR> colours;
	private String i;
	private boolean first;
	
	public Palette()
	{
		colours = new ArrayList<>();
	}
	
	public Palette(P_COLOUR[] colours)
	{
		this.colours = new ArrayList<>(Arrays.asList(colours));
	}

	public void addColour(P_COLOUR colour)
	{
		if (colour != null)
		{
		colours.add(colour);
		}
	}
	
	public String getColours() {
        StringBuilder result = new StringBuilder();
        first = true;

        if (colours.isEmpty()) {
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
}