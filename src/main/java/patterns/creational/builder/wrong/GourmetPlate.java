package patterns.creational.builder.wrong;

import java.util.logging.Logger;

public class GourmetPlate {

	private static final Logger LOG = Logger.getLogger("GourmetPlate");
	
	private Oyster oyster;
	private Souffle souffle;
	private Sirloin sirloin;
	
	public GourmetPlate(Oyster oyster) {
		this.oyster = oyster;
		LOG.info("Adding oyster to gourmet plate");
	}
	
	public GourmetPlate(Souffle souffle) {
		this.souffle = souffle;
		LOG.info("Adding souffle to gourmet plate");
	}
	
	public GourmetPlate(Sirloin sirloin) {
		this.sirloin = sirloin;
		LOG.info("Adding sirloin to gourmet plate");
	}

	@Override
	public String toString() {
		return "GourmetPlate [oyster=" + oyster + ", souffle=" + souffle + ", sirloin=" + sirloin + "]";
	}
	
	
}
