package cw2.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для вывода в консоль содержимого всей корзины
 */
public class CalculateAllFruitsInBasket implements Calculate<IBasket> {
    @Override
    public void calculate(IBasket basket) {
        List<String> allFruits = getAllFruitsFromBasket(basket);
        for (String fruit: allFruits) System.out.println(fruit);

    }


    private List<String> getAllFruitsFromBasket(IBasket<Fruits> basket) {
        List<String> result = new ArrayList<>();
        for (Fruits fruit : basket) {
            result.add(String.format("%s - %s шт.", fruit.getName(), basket.getPlantAmount(fruit)));

        }
        return result;
    }
}
