package decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.main.IPizza;
import decorator.main.PlainPizza;
import decorator.main.TomatoSauce;

public class TomatoSauceTest {

	@Test
	public void testGetCost() {
		IPizza tomatoSaucePizza = new TomatoSauce(new PlainPizza());
		double result = tomatoSaucePizza.getCost();
		assertEquals(4.35, result, 0.002);
	}
	
	@Test
	public void testGetDesCription() {
		IPizza tomatoSaucePizza = new TomatoSauce(new PlainPizza());
		String result = tomatoSaucePizza.getDescription();
		assertEquals("Thin Dough, Sauce", result);
	}

}
