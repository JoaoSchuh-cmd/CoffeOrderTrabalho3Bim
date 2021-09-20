package models.additionals;

import abstractClass.Coffe;
import decorators.OrderDecorator;

public class GeloDeCremeDeLeite extends OrderDecorator {

	private static final double ADDITIONAL_COST = 1.75;
	private static final String ADDITIONAL_NAME = "Cubo de Gelo de Creme de Leite";
	
	public GeloDeCremeDeLeite(Coffe coffe) {
		super(coffe);
		System.out.println("Adicionando CUBO DE GELO DE CREME DE LEITE");
		super.setAdditional(ADDITIONAL_NAME);
	}
	
	public double getCost() {
		return super.getCost() + ADDITIONAL_COST;
	}
}
