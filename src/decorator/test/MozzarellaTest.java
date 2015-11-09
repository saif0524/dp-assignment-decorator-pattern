package decorator.test;

import static org.junit.Assert.*;

import org.junit.Test;

import decorator.main.IPizza;
import decorator.main.Mozzarella;
import decorator.main.PlainPizza;

public class MozzarellaTest {

	@Test
	public void testGetCost() {
		IPizza mozzarellaPizza = new Mozzarella(new PlainPizza());
		double result = mozzarellaPizza.getCost();
		assertEquals(4.50, result, 0.00);
	}
	
	@Test
	public void testGetDesCription() {
		IPizza mozzarellaPizza= new Mozzarella(new PlainPizza());
		String result = mozzarellaPizza.getDescription();
		assertEquals("Thin Dough, Mozzarella", result);
	}

}
