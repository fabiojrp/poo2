public class PagamentoDebito implements PagamentoAntigo {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via débito.");
    }
}
