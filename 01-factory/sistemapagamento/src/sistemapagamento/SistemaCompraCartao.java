package sistemapagamento;

import java.util.Date;

public class SistemaCompraCartao extends SistemaCompra {

	private String numCartao;
	private String nome;
	private String sobreNome;
	private Date validade;
	private String cod;
	@Override
	public Pagamento criarPagamento() {		
		return new PagamentoCartao(numCartao,nome, sobreNome,validade, cod);
	}

}
