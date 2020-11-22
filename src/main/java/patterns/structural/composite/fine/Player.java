package patterns.structural.composite.fine;

import patterns.utils.Printer;

public abstract class Player {

	protected Printer printer = Printer.getInstance();

	protected String name;

	protected String getName() {
		return this.name;
	}

	public abstract String play();
}
