package sistemalogistica;

public class RailLogistic extends Logistic{
	@Override
	public Transport createTransport() {		
		return new Train();
	}

}
