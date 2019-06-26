package conta;

import java.util.Random;

public final class SeguroDeVida implements Tributavel {

	@Override
	public double getValorImposto() {
		Random r = new Random();
		return r.nextDouble();
	}

}
