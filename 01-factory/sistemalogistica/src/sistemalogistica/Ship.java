package sistemalogistica;

public class Ship implements Transport {
	private int id;

	@Override
	public void deliver() {		
		System.out.println("A mercadoria está sendo transportada por um navio");
	}

}
