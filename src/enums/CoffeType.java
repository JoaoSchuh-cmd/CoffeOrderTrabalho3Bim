package enums;

import models.coffe.*;

public enum CoffeType {
	COFFE {
		@Override
		public Coffe getCoffeType(CoffeType coffeType) {
			return new PureCoffe(coffeType);
		}
	},
	
	COFFE_WITH_MILK {
		@Override
		public Coffe getCoffeType(CoffeType coffeType) {
			return new WithMilkCoffe(coffeType);
		}	
	},
	
	MILK_WITH_CHOCOLATE {
		@Override
		public Coffe getCoffeType(CoffeType coffeType) {
			return new MilkWithChocolateCoffe(coffeType);
		}
	},
	
	MOCHA_COFFE {
		@Override
		public Coffe getCoffeType(CoffeType coffeType) {
			return new MochaCoffe(coffeType);
		}
	},
	
	EXPRESSO_PANNA {
		@Override
		public Coffe getCoffeType(CoffeType coffeType) {
			return new ExpressoPannaCoffe(coffeType);
		}
	};
	
	public abstract Coffe getCoffeType(CoffeType coffeType);
}
