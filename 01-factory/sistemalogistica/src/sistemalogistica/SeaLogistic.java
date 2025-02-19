package sistemalogistica;

public class SeaLogistic extends Logistic {

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
