package ProblemSet_6a;

public class Ingredient {
    private String name;
    private IngredientType type;
    private Supplier supplier;
    private double rawWeight;

    public Ingredient(String name, IngredientType type, Supplier supplier, int rawWeight) {
        this.name = name;
        this.type = type;
        this.supplier = supplier;
        this.rawWeight = rawWeight;
    }

    public double getCookedWeight() {
        return rawWeight * 0.8;
    }

    public IngredientType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSupplier() {
        return supplier.getName();
    }

    public double getRawWeight() {
        return rawWeight;
    }
}
