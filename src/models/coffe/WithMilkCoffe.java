package models.coffe;

import enums.CoffeType;

public class WithMilkCoffe extends Coffe {
	
	private static final String COFFE = "Caf� com Leite";
	private static final double COST = 1.75;
	
	public WithMilkCoffe(CoffeType coffeType) {
		super(coffeType, COST);
	}
	
}
