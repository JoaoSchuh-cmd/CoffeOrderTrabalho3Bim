package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class ChocolateEmPo extends OrderDecorator {

	private static final double ADDITIONAL_COST = 1.50;
	private static final String ADDITIONAL_NAME = "Chocolate em Pó";
	
	public ChocolateEmPo(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando CHOCOLATE  EM PÓ");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}

