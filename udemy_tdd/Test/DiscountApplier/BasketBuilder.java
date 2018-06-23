package DiscountApplier;

import java.util.ArrayList;
import java.util.List;

public class BasketBuilder {
    private List<Item> items = new ArrayList<>();
    private DiscountApplier discountApplier = new DiscountApplier();

    public BasketBuilder BasketBuilder() {
        return this;
    }

    public BasketBuilder with(String name, int qty, int price) {
        Item item = new Item(name, qty, price);
        items.add(item);
        return this;
    }

    public Basket build() {
        Basket basket = new Basket(items);
        discountApplier.apply(basket);
        return basket;
    }

}
