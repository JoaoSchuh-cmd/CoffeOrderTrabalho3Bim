package models.cup;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class Medium extends OrderDecorator {
	
	private static final double CUP_TAX = 1.20; 
		
		public Medium(Coffe coffe) {
			super(coffe);
		}
		
		public double getCost() {
			return super.getCost() * CUP_TAX;
		}
}
