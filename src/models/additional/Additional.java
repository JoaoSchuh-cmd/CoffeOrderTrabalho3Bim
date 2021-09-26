package models.additional;

import enums.AdditionalType;
import mainClass.Order.OrderBuilder;

public class Additional extends OrderBuilder {
	
	public Additional(AdditionalType additional, double cost) {
		super.additional(additional);
		super.cost(cost);
	}
	
}
