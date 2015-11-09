package decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.main.IPizza;
import decorator.main.PlainPizza;

public class PlainPizzaTest {

	@Test
	public void testGetCost() {
		IPizza tomatoSaucePizza = new PlainPizza();
		double result = tomatoSaucePizza.getCost();
		assertEquals(4.00, result, 0.00);
	}
	
	@Test
	public void testGetDesCription() {
		IPizza tomatoSaucePizza = new PlainPizza();
		String result = tomatoSaucePizza.getDescription();
		assertEquals("Thin Dough", result);
	}

}
