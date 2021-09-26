package enums;

import models.cup.*;

public enum CupType {
	SMALL {
		@Override
		public Cup getCupType(CupType cupType) {
			return new SmallCup(cupType);
		}
	},
	
	MEDIUM {
		@Override
		public Cup getCupType(CupType cupType) {
			return new MediumCup(cupType);
		}
	},
	
	LARGE {
		@Override
		public Cup getCupType(CupType cupType) {
			return new LargeCup(cupType);
		}
	};
	
	public abstract Cup getCupType(CupType cupType);
}
