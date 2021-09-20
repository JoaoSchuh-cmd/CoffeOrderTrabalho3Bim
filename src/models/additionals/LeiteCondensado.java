package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class LeiteCondensado extends OrderDecorator {

	private static final double ADDITIONAL_COST = 1.85;
	private static final String ADDITIONAL_NAME = "Leite Condensado";
	
	public LeiteCondensado(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando LEITE CONDENSADO");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}
