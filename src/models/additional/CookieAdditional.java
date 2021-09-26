package models.additional;

import enums.AdditionalType;

public class CookieAdditional extends Additional {
	
	private static final String ADDITIONAL = "Cookie";
	private static final double COST = 0.90;
	
	public CookieAdditional(AdditionalType additional) {
		super(additional, COST);
	}
	
}
