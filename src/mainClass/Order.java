package mainClass;

import java.util.ArrayList;
import enums.*;
import models.additional.*;
import models.coffe.*;
import models.cup.*;

public class Order {
	private CoffeType coffe;
	private CupType cup;
	private AdditionalType additional;
	private double cost;
	
	
	
	public Order(CoffeType coffe, CupType cup, AdditionalType additional, double cost) {
		this.coffe = coffe;
		this.cup = cup;
		this.additional = additional;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Order [coffe=" + coffe + ", cup=" + cup + ", additionalList=" + additional + ", cost=" + cost + "]";
	}

	public static class OrderBuilder {
		private CoffeType coffe;
		private CupType cup;
		private AdditionalType additional;
		private double cost;
		
		public OrderBuilder() {
		}
		
		public OrderBuilder coffe(CoffeType coffeType) {
			this.coffe = coffeType;
			return this;
		}
		public OrderBuilder cup(CupType cupType) {
			this.cup = cupType;
			return this;
		}
		public OrderBuilder additional(AdditionalType additionalType) {
			this.additional = additionalType;
			return this;
		}
		public OrderBuilder cost(double cost) {
			this.cost += cost;
			return this;
		}
		
		public Order generateOrder() {
			return new Order(coffe, cup, additional, cost);
		}
		public double getCost() {
			return this.cost;
		}

		@Override
		public String toString() {
			return "OrderBuilder [coffe=" + coffe + ", cup=" + cup + ", additional=" + additional + ", cost=" + cost
					+ "]";
		}
		
		
	}
}
