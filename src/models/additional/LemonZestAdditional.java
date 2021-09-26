package models.additional;

import enums.AdditionalType;

public class LemonZestAdditional extends Additional {
	
	private static final String ADDITIONAL = "Raspas de Limão";
	private static final double COST = 0.50;
	
	public LemonZestAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
