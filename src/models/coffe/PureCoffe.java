package models.coffe;

import enums.CoffeType;

public class PureCoffe extends Coffe {
	
	private static final String COFFE = "Café Puro";
	private static final double COST = 1.50;
	
	public PureCoffe(CoffeType coffeType) {
		super(coffeType, COST);
	}
	
}
