public abstract class BaseDecorator extends Notifier{
    protected Notifier notifier;
    
    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    
    public abstract void send(String message);    
}
