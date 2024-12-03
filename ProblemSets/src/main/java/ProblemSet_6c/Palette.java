package ProblemSet_6c;

import java.util.ArrayList;
import java.util.Arrays;

public class Palette {
    private ArrayList<P_COLOUR> primaryColours;

    public Palette() {
        primaryColours = new ArrayList<>();
    }

    public Palette(P_COLOUR[] primaryColours) {
        this.primaryColours = new ArrayList<>(Arrays.asList(primaryColours));
        if (primaryColours.length > 3) {
            throw new IllegalArgumentException("Maximum of 3 Colours permitted in a Palette.");
        }
    }

    public void addColour(P_COLOUR colour) {
        if (colour != null) {
            if (primaryColours.size() < 3) {
                primaryColours.add(colour);
            } else {
                throw new IllegalStateException("Cannot add more than 3 primaryColours.");
            }
        }
    }

    public String getColours() {
        StringBuilder result = new StringBuilder();
        boolean first = true;

        if (primaryColours.isEmpty()) {
            return "No primaryColours added";
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

    public String mixColours() {
        primaryColours.removeIf(colour -> colour == null);

        switch (primaryColours.size()) {
            case 1:
                return primaryColours.get(0).name();
            case 2:
                P_COLOUR first = primaryColours.get(0);
                P_COLOUR second = primaryColours.get(1);

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

    public String display() {
        StringBuilder displayString = new StringBuilder();
        displayString.append(getColours()).append(" = ").append(mixColours());
        return displayString.toString();
    }
}
