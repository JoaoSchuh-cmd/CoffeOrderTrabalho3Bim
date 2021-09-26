package models.additional;

import enums.AdditionalType;

public class IceMilkCreamAdditional extends Additional {
	
	private static final String ADDITIONAL = "Cubo de Gelo de Creme de Leite";
	private static final double COST = 1.75;
	
	public IceMilkCreamAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
