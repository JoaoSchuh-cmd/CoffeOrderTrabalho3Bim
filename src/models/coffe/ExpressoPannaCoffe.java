package models.coffe;

import enums.CoffeType;

public class ExpressoPannaCoffe extends Coffe {
	
	private static final String COFFE = "Large Cup";
	private static final double COST = 4.50;
	
	public ExpressoPannaCoffe(CoffeType coffeType) {
		super(coffeType, COST);
	}
	
}
