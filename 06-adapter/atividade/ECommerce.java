public class ECommerce {
    public static void main(String[] args) {
        PagamentoAntigo cartao = new PagamentoCartaoCredito();
        PagamentoAntigo debito = new PagamentoDebito();
        
        cartao.processarPagamento(100.0);
        debito.processarPagamento(50.0);
    }
}
