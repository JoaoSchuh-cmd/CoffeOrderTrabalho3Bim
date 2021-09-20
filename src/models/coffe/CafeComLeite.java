package models.coffe;

import abstractClass.Coffe;

public class CafeComLeite extends Coffe {

	private static final double COFFE_COST = 1.75;
	private static final String COFFE_NAME = "Café com Leite";
	
	@Override
	public double getCost() {
		return COFFE_COST;
	}
	@Override
	public String getDescription() {
		return COFFE_NAME;
	}
}
