package models.coffe;

import abstractClass.Coffe;

public class Mocha extends Coffe {

	private static final double COFFE_COST = 4.00;
	private static final String COFFE_NAME = "Mocha Coffe";
	
	@Override
	public double getCost() {
		return COFFE_COST;
	}

	@Override
	public String getDescription() {
		return COFFE_NAME;
	}
}
