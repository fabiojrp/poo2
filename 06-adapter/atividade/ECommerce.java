public class ECommerce {
    public static void main(String[] args) {
        //PagamentoAntigo cartao = new PagamentoCartaoCredito();
        PagamentoAntigo debito = new PagamentoDebito();
        PagamentoFastPay fast = new PagamentoFastPay();

        SistemaX six = new SistemaX(debito);
        six.efetivarTransacao(100);
    
        SistemaX six2 = new SistemaX(fast);
    }
}
