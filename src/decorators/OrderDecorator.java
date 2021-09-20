package decorators;

import java.util.ArrayList;

import abstractClass.Coffe;

public class OrderDecorator extends Coffe {

	private Coffe coffe;
	
	
	
	public OrderDecorator(Coffe coffe) {
		this.coffe = coffe;
	}
	
	@Override
	public double getCost() {
		return coffe.getCost();
	}
	@Override
	public String getDescription() {
		return coffe.getDescription();
	}

	
	
}
