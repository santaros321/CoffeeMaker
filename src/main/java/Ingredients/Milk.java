package Ingredients;

public class Milk implements Ingredient{

    private final double milkMaxLVL = 1499;
    private int milkAmount;

    public Milk(){
        milkAmount=(int)(Math.random()*milkMaxLVL+1);
    }
    @Override
    public void addIngredient(int amount) {
        this.milkAmount += amount;
    }

    @Override
    public void removeIngredient(int amount) {
        this.milkAmount -= amount;
    }

    public int getMilkAmount() {
        return milkAmount;
    }

    @Override
    public String toString() {
        return "Milk:   "+(Math.round(milkAmount/milkMaxLVL*100))+"% "+milkAmount;
    }
}
