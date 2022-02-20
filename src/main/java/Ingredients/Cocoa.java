package Ingredients;

public class Cocoa implements Ingredient{

    private final double cocoaMaxLVL = 999;
    private int cocoaAmount;

    public Cocoa() {
        cocoaAmount = (int)(Math.random()*cocoaMaxLVL+1);
    }

    @Override
    public void addIngredient(int amount) {
        cocoaAmount += amount;
    }

    @Override
    public void removeIngredient(int amount) {
        cocoaAmount -= amount;
    }

    @Override
    public String toString() {
        return "Cocoa:  "+(Math.round(cocoaAmount/cocoaMaxLVL*100))+"% "+cocoaAmount;
    }
}
