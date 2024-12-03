package ProblemSet_6b;

import java.util.ArrayList;
import java.util.Arrays;

public class Palette {
    private ArrayList<P_COLOUR> primaryColours;

    public Palette() {
        primaryColours = new ArrayList<>();
    }

    public Palette(P_COLOUR[] primaryColours) {
        this.primaryColours = new ArrayList<>(Arrays.asList(primaryColours));
    }

    public void addColour(P_COLOUR colour) {
        if (colour != null) {
            primaryColours.add(colour);
        }
    }

    public String getColours() {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        if (primaryColours.isEmpty()) {
            return "No colours added";
        }

        for (P_COLOUR colour : primaryColours) {
            if (colour != null) {
                if (!first) {
                    result.append(", ");
                } else {
                    first = false;
                }

                result.append(colour.name());
            }
        }

        return result.toString();
    }
}
