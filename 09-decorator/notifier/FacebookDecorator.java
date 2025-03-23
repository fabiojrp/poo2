public class FacebookDecorator extends BaseDecorator {
    
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }
    
    public void send(String message) {
        notifier.send(message);
        System.out.println("Sending Facebook message");
    }
    
}
