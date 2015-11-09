/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public class PlainPizza implements IPizza {

	public String getDescription() {
		return "Thin Dough";
	}

	public double getCost() {
		return 4.00;
	}

}
