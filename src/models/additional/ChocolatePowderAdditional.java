package models.additional;

import enums.AdditionalType;

public class ChocolatePowderAdditional extends Additional {
	
	private static final String ADDITIONAL_NAME = "Chocolate em Pó";
	private static final double COST = 1.50;
	
	public ChocolatePowderAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
