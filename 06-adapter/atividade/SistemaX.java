public class SistemaX {
    PagamentoAntigo pagamento;

    public SistemaX(PagamentoAntigo pgto){
        this.pagamento = pgto;
    }

    public void efetivarTransacao(double valor){
        this.pagamento.processarPagamento(valor);
        System.out.println("Transação realizada com sucesso!");
    }
    
}
