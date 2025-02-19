package sistemapagamento;

import java.util.Date;

public class PagamentoCartao implements Pagamento {
	
	private String numCartao;
	private String nome;
	private String sobreNome;
	private Date validade;
	private String cod;
	
	//public PagamentoCartao() {
		// TODO Auto-generated constructor stub
	//}
		
	public PagamentoCartao(String numCartao, String nome, String sobreNome, Date validade, String cod) {
		super();
		this.numCartao = numCartao;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.validade = validade;
		this.cod = cod;
	}

	@Override
	public void efetuarPagamento(double valor) {
		this.validarCartao();

	}
	
	private boolean validarCartao() {
		return true;
	}
		

}
