/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public class TomatoSauce extends AToppingDecorator {

	public TomatoSauce(IPizza newPizza) {
		super(newPizza);

		System.out.println("Adding Tomato Sauce.");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", Sauce";
	}

	public double getCost() {
		return tempPizza.getCost() + .35;
	}
}
