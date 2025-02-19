package sistemalogistica;

public class Truck implements Transport {
	private int id;	
	
	@Override
	public void deliver() {
		System.out.println("A mercadoria está sendo transportada por Caminhão.");	
	}

}
