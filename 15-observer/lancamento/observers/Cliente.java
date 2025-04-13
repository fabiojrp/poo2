package lancamento.observers;

public class Cliente implements Observer {    
    public void avisarLancamento(String mensagem) {
        System.out.println("Client: " + mensagem);
    }
    
}
