package lancamento;

import lancamento.subject.Loja;
import lancamento.observers.Cliente;
public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        loja.addObserver(c1);
        loja.addObserver(c2);

        loja.notificarObservers("Iphone 74");
    }
    
}
