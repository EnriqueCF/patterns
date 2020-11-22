package patterns.creational.builder.wrong;

import java.util.logging.Logger;

public class CombinatePlate {

	private static final Logger LOG = Logger.getLogger("CombinatePlate");
	private Salad salad;
	private Custard egg;
	private Chicken chicken;

	public CombinatePlate(Salad salad) {
		this.salad = salad;
		LOG.info("Adding salad to combination plate");
	}

	public CombinatePlate(Custard egg) {
		this.egg = egg;
		LOG.info("Adding egg to combination plate");
	}

	public CombinatePlate(Chicken chicken) {
		this.chicken = chicken;
		LOG.info("Adding chicken to combination plate");
	}

	@Override
	public String toString() {
		return "CombinatePlate [salad=" + salad + ", egg=" + egg + ", chicken=" + chicken + "]";
	}

}
