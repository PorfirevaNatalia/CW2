package cw2.java;

import java.util.Map;

public interface IBasket<T> extends Iterable<T>{
    int getBasketSize();
    void addToBasket(T plant);
    Integer getPlantAmount(T plant);

    Map<T, Integer> getBasket();
}
