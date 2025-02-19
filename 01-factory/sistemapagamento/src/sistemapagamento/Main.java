package sistemapagamento;

public class Main {
	
	public static void main(String[] args) {
		SistemaCompra sc = new SistemaCompraCartao();
		sc.processarCompra(1000);
	
	}

}
