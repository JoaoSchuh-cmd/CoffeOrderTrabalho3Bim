package models.additional;

import enums.AdditionalType;

public class CondensedMilkAdditional extends Additional {
	
	private static final String ADDITIONAL = "Leite Condensado";
	private static final double COST = 1.85;
	
	public CondensedMilkAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
