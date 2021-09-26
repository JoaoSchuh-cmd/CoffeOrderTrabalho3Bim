package models.cup;

import enums.CupType;
import mainClass.Order.OrderBuilder;;

public class Cup extends OrderBuilder {
	
	public Cup(CupType cupType, double value) {
		super.cup(cupType);
		super.cost(super.getCost()*value);
	}

}
