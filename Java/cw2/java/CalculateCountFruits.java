package cw2.java;

/**
 * Класс для вывода в консоль количества фруктов в корзине
 */
public class CalculateCountFruits implements Calculate<IBasket> {

    @Override
    public void calculate(IBasket basket) {
        System.out.printf("Всего фруктов - %s%n", basket.getBasketSize());
    }
}
