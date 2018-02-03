/*
 * Author	: Saif Uddin Mahmud
 * Date	 	: April 12, 2015	
 * Reference: https://www.youtube.com/watch?v=j40kRwSm4VE
 */
package decorator.main;

public class PlainPizza implements IPizza {

	String descritption;
	double cost;
	
	public String getDescription() {
		return "Thin Dough";
	}

	public double getCost() {
		return 4.00;
	}
	
	PlainPizza(String description, double cost){
		this.descritption = description;
		this.cost = cost;
	}
	
	
	public void tesPlain(String x) {
		System.out.println("test plain");
	}
	

}
