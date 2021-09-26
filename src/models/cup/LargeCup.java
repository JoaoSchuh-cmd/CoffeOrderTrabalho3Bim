package models.cup;

import enums.CupType;

public class LargeCup extends Cup {

	private static final String CUP = "Large Cup";
	private static final double TAX = 1.35;
	
	public LargeCup(CupType cupType) {
		super(cupType, TAX);
	}

}
