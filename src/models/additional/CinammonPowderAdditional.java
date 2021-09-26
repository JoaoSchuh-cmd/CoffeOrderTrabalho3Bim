package models.additional;

import enums.AdditionalType;

public class CinammonPowderAdditional extends Additional {
	
	private static final String ADDITIONAL = "Canela em Pó";
	private static final double COST = 0.75;
	
	public CinammonPowderAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
