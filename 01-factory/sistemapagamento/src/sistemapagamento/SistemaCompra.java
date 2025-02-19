package sistemapagamento;

public abstract class SistemaCompra {
		
	
	public void processarCompra(double valor) {
		Pagamento pag = criarPagamento();
		pag.efetuarPagamento(valor);
				
	}
		
	public abstract Pagamento criarPagamento();

}
