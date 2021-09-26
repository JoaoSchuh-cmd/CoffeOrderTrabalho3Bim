package models.coffe;

import enums.CoffeType;

public class MilkWithChocolateCoffe extends Coffe {
	
	private static final String COFFE = "Leite com Chocolate";
	private static final double COST = 2.50;
	
	public MilkWithChocolateCoffe(CoffeType coffeType) {
		super(coffeType, COST);
	}
	
}
