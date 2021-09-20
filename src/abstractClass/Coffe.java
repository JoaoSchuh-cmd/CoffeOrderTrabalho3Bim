package abstractClass;

import java.util.ArrayList;

public abstract class Coffe {
	private ArrayList<String> additionals = new ArrayList();
	
	
	public abstract double getCost();
	public abstract String getDescription();
	
	public ArrayList<String> getAdditionals() {
		return additionals;
	}

	public void setAdditional(String additionals) {
		this.additionals.add(additionals);
	}
}
