package org.example.discounts;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PriceCalculatorTest {
    @Test
    public void total_zero_when_there_are_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_the_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();

        priceCalculator.addPrice(10.2);
        priceCalculator.addPrice(15.5);

        assertThat(priceCalculator.getTotal(), is(25.7));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator calculator = new PriceCalculator();

        calculator.addPrice(12.5);
        calculator.addPrice(17.5);

        calculator.setDiscount(50);

        assertThat(calculator.getTotal(), is(30.0));
    }
}