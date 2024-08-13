package view;

import controller.FatorialController;

public class Fatorial {

	public static void main(String[] args) {
		FatorialController obj = new FatorialController();
		
		int n = 7;
		
		if(n < 0 || n % 2 == 0) {
			System.out.println("Calculo somente com números ímpares positivos!");
		} else {
			System.out.println(obj.calcular(n));
		}
	}
}
