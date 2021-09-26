package models.coffe;

import enums.CoffeType;

public class MochaCoffe extends Coffe {
	
	private static final String COFFE = "Mocha Coffe";
	private static final double COST = 4.00;
	
	public MochaCoffe(CoffeType coffeType) {
		super(coffeType, COST);
	}
	
}
