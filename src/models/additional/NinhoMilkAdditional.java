package models.additional;

import enums.AdditionalType;

public class NinhoMilkAdditional extends Additional {
	
	private static final String ADDITIONAL = "Leite Ninho";
	private static final double COST = 1.40;
	
	public NinhoMilkAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
