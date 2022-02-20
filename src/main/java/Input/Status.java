package Input;

import Ingredients.Cocoa;
import Ingredients.Coffee;
import Ingredients.Milk;
import Ingredients.Water;

import java.util.ArrayList;
import java.util.List;

public class Status {

    private final Coffee coffee = new Coffee();
    private final Water water = new Water();
    private final Milk milk = new Milk();
    private final Cocoa cocoa = new Cocoa();
    private final List<Object> ingredientList = new ArrayList<>(List.of(
            coffee,
            water,
            milk,
            cocoa
    ));

    public void printStatus(){
        ingredientList.forEach(e -> System.out.println(e.toString()));
    }

}
