package models.cup;

import enums.CupType;

public class SmallCup extends Cup {
	private static final String CUP = "Small Cup";
	private static final double TAX = 1.00;
	
	public SmallCup(CupType cupType) {
		super(cupType, TAX);
	}
}
