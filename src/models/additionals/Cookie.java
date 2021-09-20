package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class Cookie extends OrderDecorator {

	private static final double ADDITIONAL_COST = 0.90;
	private static final String ADDITIONAL_NAME = "Cookie";
	
	public Cookie(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando COOKIE");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}
