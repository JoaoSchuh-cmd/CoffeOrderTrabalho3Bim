package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class LeiteNinho extends OrderDecorator {

	private static final double ADDITIONAL_COST = 1.40;
	private static final String ADDITIONAL_NAME = "Leite Ninho";
	
	public LeiteNinho(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando LEITE NINHO");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}
