package basicCoffe;

import abstractClass.Coffe;

public class CafePuro extends Coffe{

	private static final double COFFE_COST = 1.50;
	private static final String COFFE_NAME = "Café Puro";
	
	@Override
	public double getCost() {
		return COFFE_COST;
	}
	@Override
	public String getDescription() {
		return COFFE_NAME;
	}
	
	

}
