package controller;

public class FatorialController {
	public FatorialController() {
		super();
	}
	
	public int calcular(int n) {
		if(n == 0) {
			return 1;
		} else {
			if(n % 2 != 0) {
				return n  * calcular(n - 1);
			} else {
				return calcular(n - 1);
			}
		}
	}
}