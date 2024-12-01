package ProblemSet_6a;

public class Ingredient
{
	private String ingredientName;
	private IngredientType type;
	private Supplier supplier;
	private int cookedWeight;
	
    public Ingredient(String ingredientName, IngredientType type, Supplier supplier, int cookedWeight)
    {
		this.ingredientName = ingredientName;
		this.type = type;
		this.supplier = supplier;
		this.cookedWeight = cookedWeight;
	}
	
	public double getCookedWeight()
	{
		return cookedWeight * 0.8;
	}
	
    public IngredientType getType()
    {
        return type;
    }
    
    public String getName()
    {
    	return ingredientName;
    }
    
    public String getSupplier()
    {
    	return supplier.getName();
    }
    
    public double getRawWeight()
    {
    	return (cookedWeight);
    }
}