package dados;

import java.util.Random;

public class D6 {

	private int dado;
	
	public D6() {
		Random numero = new Random();
		dado = numero.nextInt(7);
		while(dado == 0)
			dado = numero.nextInt(7);
	}
	
	public int getD6() {
		return this.dado;
	}
}
