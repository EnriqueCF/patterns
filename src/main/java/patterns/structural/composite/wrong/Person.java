package patterns.structural.composite.wrong;

import patterns.utils.Printer;

public class Person {

	private Printer printer = Printer.getInstance();

	private String name;

	public String getName() {
		return this.name;
	}

	public Person(String name) {
		printer.printMessageLevel1("Creating person " + name);
		this.name = name;
	}

	public String play() {
		return this.name + ": Giving an answer for the question (person) \n";
	}
}
