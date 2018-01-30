/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public class Mozzarella extends AToppingDecorator {

	public Mozzarella(IPizza newPizza, int x) {
		super(newPizza);

		System.out.println("Adding Dough.");
		System.out.println("Adding Mozzarella.");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Mozzarella";

	}

	public double getCost() {
		return tempPizza.getCost() + .50;
	}
}