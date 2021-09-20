package models.coffe;

import abstractClass.Coffe;

public class ExpressoPanna extends Coffe {

	private static final double COFFE_COST = 4.50;
	private static final String COFFE_NAME = "Café Expresso Panna";
	
	@Override
	public double getCost() {
		return COFFE_COST;
	}
	@Override
	public String getDescription() {
		return COFFE_NAME;
	}
}
