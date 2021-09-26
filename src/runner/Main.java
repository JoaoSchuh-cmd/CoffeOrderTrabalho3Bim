package runner;

import javax.swing.JOptionPane;
import mainClass.Order;
import mainClass.Order.OrderBuilder;
import enums.*;
//import models.coffe.*;
//import models.additional.*;
//import models.cup.*;

public class Main {
	public static void main(String[] args) {
		
		String[] btnCup = {"Pequena", "M�dia", "Grande", "Cancel"};
		int cupReturnValue = JOptionPane.showOptionDialog(null, "Escolha um tamanho de x�cara para prosseguir: ", "Escolha de x�cara", JOptionPane.WARNING_MESSAGE, 0, null, btnCup, btnCup[0]);
		
		String[] btnCoffe = {"Caf� Puro", "Caf� com Leite", "Leite com Chocolate", "Mocha Coffe", "Expresso Panna", "Cancel"};
		int coffeReturnValue = JOptionPane.showOptionDialog(null, "Escolha um sabor de caf� para prosseguir: ", "Escolha de sabor", JOptionPane.WARNING_MESSAGE, 0, null, btnCoffe, btnCoffe[0]);
		
		String[] btnAdditionals = {"Canela em P�", "Chocolate em P�", "Cookie", "Creme de Leite", "Leite Condensado", "Leite Ninho", "Raspas de Lim�o", "Cancel"};
		int additionalsReturnValue = JOptionPane.showOptionDialog(null, "Escolha um adicional para prosseguir: ", "Escolha de adicional", JOptionPane.WARNING_MESSAGE, 0, null, btnAdditionals, btnAdditionals[0]);
		
//		int additionalsQuantity = Integer.parseInt(JOptionPane.showInputDialog("Quantos adicionais voc� vai querer?"));
		
		
      
		CupType cupType = CupType.values()[cupReturnValue];
		CoffeType coffeType = CoffeType.values()[coffeReturnValue];
		AdditionalType additionalType = AdditionalType.values()[additionalsReturnValue];
		
//		OrderBuilder newOrderBuilder = coffeType.getCoffeType(coffeType);
//		newOrderBuilder = cupType.getCupType(cupType);
//		newOrderBuilder = additionalType.getAdditional(additionalType);
		
		Order newOrder = new OrderBuilder()
				.coffe(coffeType)
				.cup(cupType)
				.additional(additionalType)
				.additional(additionalType.COOKIE)
				.generateOrder();
		
//		Order newOrder = new Order.OrderBuilder().generateOrder();
		System.out.println(newOrder.toString());
	}
}
