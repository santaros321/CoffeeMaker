package Ingredients;

public class Water implements Ingredient{

    private final double waterMaxLVL = 1999;
    private int waterAmount;

    public Water(){
        waterAmount = (int)(Math.random()*waterMaxLVL+1);
    }

    @Override
    public void addIngredient(int amount) {
        this.waterAmount += amount;
    }

    @Override
    public void removeIngredient(int amount) {
        this.waterAmount -= amount;
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    @Override
    public String toString() {
        return "Water:  "+(Math.round(waterAmount/waterMaxLVL*100))+"% "+waterAmount;
    }
}
