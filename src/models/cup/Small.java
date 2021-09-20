package models.cup;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class Small extends OrderDecorator {
	
	private static final double CUP_TAX = 1.00; 
		
		public Small(Coffe coffe) {
			super(coffe);
		}
		
		public double getCost() {
			return super.getCost() * CUP_TAX;
		}
}
