package Ingredients;

public class Coffee implements Ingredient{

    private final double coffeeMaxLVL = 1999;
    private int coffeeAmount;

    public Coffee() {
        this.coffeeAmount = (int)(Math.random()*coffeeMaxLVL+1);
    }

    @Override
    public void addIngredient(int amount) {
        this.coffeeAmount += amount;
    }

    @Override
    public void removeIngredient(int amount) {
        this.coffeeAmount -= amount;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }

    @Override
    public String toString() {
        return "Coffee: "+(Math.round(coffeeAmount/coffeeMaxLVL*100))+"% "+coffeeAmount;
    }
}
