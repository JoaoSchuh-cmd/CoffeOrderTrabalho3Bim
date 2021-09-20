package models.coffe;

import abstractClass.Coffe;

public class LeiteComChocolate extends Coffe {

	private static final double COFFE_COST = 2.50;
	private static final String COFFE_NAME = "Café com Leite com Chocolate";
	
	@Override
	public double getCost() {
		return COFFE_COST;
	}
	@Override
	public String getDescription() {
		return COFFE_NAME;
	}
}
