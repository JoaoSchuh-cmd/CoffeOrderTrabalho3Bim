package runner;

import abstractClass.Coffe;
import basicCoffe.CafePuro;
import models.additionals.*;
import models.coffe.*;
import models.cup.*;

public class Main {
	public static void main(String[] args) {
		Coffe newCoffe = new Medium(new CanelaEmPo(new Cookie(new GeloDeCremeDeLeite(new Mocha()))));
		
		System.out.println("Caf�: " + newCoffe.getDescription());
		System.out.println("Pre�o: " + newCoffe.getCost());
	}
}
