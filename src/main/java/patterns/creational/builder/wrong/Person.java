package patterns.creational.builder.wrong;

import java.util.Random;
import java.util.logging.Logger;

public class Person {

	private static final Logger LOG = Logger.getLogger("Person");

	enum Dish {
		BASIC, GOURMET
	}

	private int generateRandomDish() {
		Random rand = new Random();
		return rand.nextInt(Dish.values().length);
	}

	public void eat() {
		int dishToEat = this.generateRandomDish();

		if (dishToEat == Dish.BASIC.ordinal()) {

			Salad salad = this.prepareSalad();
			Chicken chicken = this.prepareChicken();
			Custard custard = this.prepareCustard();
			LOG.info("Eating menu (person)");
			LOG.info(salad.toString());
			LOG.info(chicken.toString());
			LOG.info(custard.toString());
		} else if (dishToEat == Dish.GOURMET.ordinal()) {
			Oyster oyster = this.prepareOyster();
			Sirloin sirloin = this.prepareSirloin();
			Souffle souffle = this.prepareSouffle();
			LOG.info("Eating menu (person)");
			LOG.info(oyster.toString());
			LOG.info(sirloin.toString());
			LOG.info(souffle.toString());

		}
	}

	private Salad prepareSalad() {
		LOG.info("Preparing  Salad(person)");
		return new Salad();
	}

	private Chicken prepareChicken() {
		LOG.info("Preparing  Chicken(person)");
		return new Chicken();
	}

	private Custard prepareCustard() {
		LOG.info("Preparing  Custard(person)");
		return new Custard();
	}

	private Oyster prepareOyster() {
		LOG.info("Preparing Oyster (person)");
		return new Oyster();
	}

	private Sirloin prepareSirloin() {
		LOG.info("Preparing Sirloin (person)");
		return new Sirloin();
	}

	private Souffle prepareSouffle() {
		LOG.info("Preparing Souffle (person)");
		return new Souffle();
	}
}
