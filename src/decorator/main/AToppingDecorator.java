/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public abstract class AToppingDecorator implements IPizza {

	protected IPizza tempPizza;

	public AToppingDecorator(IPizza newPizza) {
		tempPizza = newPizza;
	}

	public String getDescription() {
		return tempPizza.getDescription();

	}

	public double getCost() {
		return tempPizza.getCost();
	}
}
