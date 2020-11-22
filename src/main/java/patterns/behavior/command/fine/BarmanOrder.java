package patterns.behavior.command.fine;

public abstract class BarmanOrder extends Order{
	protected Barman[] barmen;

	protected BarmanOrder(Barman[] barmen) {
		this.barmen = barmen;
	}

	protected Barman getBarman() {
		return this.barmen[this.generateRandom(this.barmen.length)];
	}
}
