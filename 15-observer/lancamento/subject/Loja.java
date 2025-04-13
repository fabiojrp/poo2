package lancamento.subject;

import lancamento.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class Loja{
    private List<Observer> observers = new ArrayList<Observer>();
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notificarObservers(String produto) {
        for (Observer observer : observers) {
            observer.avisarLancamento("Chegou lançamento do produto: " + produto);
        }
    }
    
}
