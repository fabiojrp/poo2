package sistemalogistica;

public class Train implements Transport {

	@Override
	public void deliver() {
		System.out.println("A mercadoria está sendo entregue por trem");

	}

}
