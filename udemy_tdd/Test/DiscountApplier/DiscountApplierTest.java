package DiscountApplier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiscountApplierTest {

    BasketBuilder basketBuilder;

    @Before
    public void setUp() {
        basketBuilder = new BasketBuilder();
    }

    @Test
    public void testBasketWithMacbookAndIphone() {
        Basket basket = basketBuilder
                            .with("IPHONE", 1, 100)
                            .with("MACBOOK", 1, 200)
                            .build();
        assertEquals((100 + 200) * (1 - 0.15), basket.getAmount(), 0.0001);
    }
}