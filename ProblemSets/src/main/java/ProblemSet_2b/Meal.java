package ProblemSet_2b;

public class Meal {
    private Food food1;
    private Food food2;

    public Meal(Food food1, Food food2) {
        this.food1 = food1;
        this.food2 = food2;
    }

    public double calculateTotalSugarLevel() {
        return (food1.getAmountOfSugar() + food2.getAmountOfSugar());
    }

    public String toString() {
        return "Meal [mainCourse = " + food1.getName() + ", dessert = " + food2.getName() + "]";
    }
}
