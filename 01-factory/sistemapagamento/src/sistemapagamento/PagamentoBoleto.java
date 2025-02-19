package sistemapagamento;

public class PagamentoBoleto implements Pagamento {

	private String codigoBarra;
	
	
	public PagamentoBoleto(String codigoBarra) {	
		this.codigoBarra = codigoBarra;
	}


	@Override
	public void efetuarPagamento(double valor) {
		this.validarCodigoBarra();

	}
	
	private boolean validarCodigoBarra() {
		return true;
	}

}
