package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class CanelaEmPo extends OrderDecorator {

	private static final double ADDITIONAL_COST = 0.75;
	private static final String ADDITIONAL_NAME = "Canela em Pó";
	
	public CanelaEmPo(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando CANELA EM PÓ");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}

