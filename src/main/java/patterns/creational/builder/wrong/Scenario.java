package patterns.creational.builder.wrong;

import java.util.logging.Logger;

public class Scenario {
	private static final Logger LOG = Logger.getLogger("Scenario");
	
	public static void main (String[] args) {
		LOG.info("BUILDER WRONG");
		
		Person person = new Person();
		
		LOG.info("Person eating first dish");
		person.eat();
		
		LOG.info("Person eating second dish");
		person.eat();
	}
	
}
