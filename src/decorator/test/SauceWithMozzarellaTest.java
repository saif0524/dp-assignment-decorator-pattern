package decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.main.IPizza;
import decorator.main.Mozzarella;
import decorator.main.PlainPizza;
import decorator.main.TomatoSauce;

public class SauceWithMozzarellaTest {

	@Test
	public void testGetCost() {
		IPizza tomatoSauceAndMozzarellaPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		double result = tomatoSauceAndMozzarellaPizza.getCost();
		assertEquals(4.85, result, 0.00);
	}
	
	@Test
	public void testGetDesCription() {
		IPizza tomatoSauceAndMozzarellaPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
		String result = tomatoSauceAndMozzarellaPizza.getDescription();
		assertEquals("Thin Dough, Mozzarella, Sauce", result);
	}

}
