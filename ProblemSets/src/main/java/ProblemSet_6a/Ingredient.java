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
	
	public int getCookedWeight()
	{
		return cookedWeight;
	}
	
    public IngredientType getType()
    {
        return type;
    }
	
    public static enum IngredientType
    {
    	VEGETABLE,
    	MEAT
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
    	return (cookedWeight / 0.8);
    }
}