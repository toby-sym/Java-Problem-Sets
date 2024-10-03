package ProblemSet_2b;

public class Food {
    private String foodName;
    private double foodSugarContent;

    public Food(String inpfoodName, double inpfoodSugarContent) {
        foodName = inpfoodName;
        foodSugarContent = inpfoodSugarContent;
    }

    public String getName() {
        return foodName;
    }

    public double getAmountOfSugar() {
        return foodSugarContent;
    }
}
