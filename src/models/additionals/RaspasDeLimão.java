package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class RaspasDeLim�o extends OrderDecorator {

	private static final double ADDITIONAL_COST = 0.50;
	private static final String ADDITIONAL_NAME = "Raspas de Lim�o";
	
	public RaspasDeLim�o(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando RASPAS DE LIM�O");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}
