package cw2.java;

import java.util.Optional;

/**
 * Класс для вывода самого длинного названия фрукта в корзине
 */
public class CalculateLongestFruitName implements Calculate<IBasket>{

    @Override
    public void calculate(IBasket basket) {
        Optional<Fruits> maxFruit = basket.getBasket().keySet().stream().max(new FruitsComparator());
        System.out.printf("Самое длинное название - %s, его длина %s символов%n", maxFruit.get().getName(),maxFruit.get().getNameLength());
    }
}
