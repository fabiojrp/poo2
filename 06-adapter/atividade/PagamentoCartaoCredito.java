public class PagamentoCartaoCredito implements PagamentoAntigo {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}