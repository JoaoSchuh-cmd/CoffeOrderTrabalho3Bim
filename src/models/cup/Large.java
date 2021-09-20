package models.cup;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class Large extends OrderDecorator {

	private static final double CUP_TAX = 1.35; 
	
	public Large(Coffe coffe) {
		super(coffe);
	}
	
	public double getCost() {
		return super.getCost() * CUP_TAX;
	}
}
