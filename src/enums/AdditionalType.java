package enums;

import models.additional.*;

public enum AdditionalType {
	LEMON_ZEST {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new LemonZestAdditional(additional);
		}
	},
	
	CINAMMON_POWNDER {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new CinammonPowderAdditional(additional);
		}
	},
	
	NINHO_MILK {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new NinhoMilkAdditional(additional);
		}
	},
	
	ICE_MILK_CREAM {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new IceMilkCreamAdditional(additional);
		}
	},
	
	CHOCOLATE_POWNDER {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new ChocolatePowderAdditional(additional);
		}
	},
	
	COOKIE {
		@Override
		public Additional getAdditional(AdditionalType additional) {
			return new CookieAdditional(additional);
		}
	};
	
	public abstract Additional getAdditional(AdditionalType additional);
}
