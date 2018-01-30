/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public class PizzaMakerMain {

	public static void main(String[] args) {

		IPizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza(), 0));

		System.out.println("Ingredients: " + basicPizza.getDescription());

		System.out.println("Price: " + basicPizza.getCost());
		
		
		IPizza basicPizza1 = new TomatoSauce((new PlainPizza()));

		System.out.println("Ingredients: " + basicPizza1.getDescription());

		System.out.println("Price: " + basicPizza1.getCost());
	}

}
