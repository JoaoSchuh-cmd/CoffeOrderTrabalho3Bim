package models.cup;

import enums.CupType;

public class MediumCup extends Cup {
	
	private static final String CUP = "Medium Cup";
	private static final double TAX = 1.20;
	
	public MediumCup(CupType cupType) {
		super(cupType, TAX);
	}
	
}	
