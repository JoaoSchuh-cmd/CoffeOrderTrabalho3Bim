package models.coffe;

import enums.CoffeType;
import mainClass.Order.OrderBuilder;

public class Coffe extends OrderBuilder {

	public Coffe(CoffeType coffeType, double cost) {
		super.coffe(coffeType);
		super.cost(cost);
	}
	
}
